/**
 * 
 */
package com.nublo.loadservice.sevices.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nublo.loadservice.api.model.Balances;
import com.nublo.loadservice.api.model.LoadCardBalanceRequest;
import com.nublo.loadservice.api.model.LoadForexCardApiResponse;
import com.nublo.loadservice.api.model.LoadForexCardRequest;
import com.nublo.loadservice.api.model.Transaction;
import com.nublo.loadservice.dao.model.Account;
import com.nublo.loadservice.dao.model.AccountBalance;
import com.nublo.loadservice.dao.model.Card;
import com.nublo.loadservice.dao.model.CardAccountLink;
import com.nublo.loadservice.dao.model.pk.BalancePK;
import com.nublo.loadservice.dao.model.pk.CardPK;
import com.nublo.loadservice.dbrepository.AccountBalanceRepository;
import com.nublo.loadservice.dbrepository.AccountRepository;
import com.nublo.loadservice.dbrepository.CardRepository;
import com.nublo.loadservice.dbrepository.ICardAccountLinkRepository;
import com.nublo.loadservice.services.ILoadCardService;

import jakarta.transaction.Transactional;

/**
 * @author DELL
 *
 */
@Service
@Transactional
public class LoadCardBalanceServiceImpl implements ILoadCardService {

	@Autowired
	private CardRepository cardRepo;

	@SuppressWarnings("unused")
	@Autowired
	private AccountRepository accountRepo;

	@Autowired
	private AccountBalanceRepository accBalanceRepo;

	@Autowired
	private ICardAccountLinkRepository cardAccLinkRepo;

	@Override
	public void loadCardBalance(LoadCardBalanceRequest loadCardRequest) {
		String bankId = loadCardRequest.getBankId();
		String cardNumber = loadCardRequest.getCardNumber();
		try {
			CardPK cardPk = new CardPK();
			cardPk.setBankId(bankId);
			cardPk.setDeviceNumber(cardNumber);
			Optional<Card> cardOption = cardRepo.findById(cardPk);
			if (!cardOption.isEmpty()) {
				Card card = cardOption.get();
				if (card.getStatusCode() == 1) {
					Date cardExpiryDt = card.getExpiryDate();
					SimpleDateFormat sdf = new SimpleDateFormat("yyMM");
					String strCardExpiryDt = sdf.format(cardExpiryDt);
					if (strCardExpiryDt.equals(loadCardRequest.getExpiryDate())) {
						Date currentDate = new Date();
						if (cardExpiryDt.after(currentDate)) {
							CardAccountLink cardAccountLink = getCardAccLink(bankId, cardNumber);
							if (cardAccountLink != null) {
								AccountBalance accBalance = getAccountBalance(bankId,
										cardAccountLink.getId().getAccNumber());
								Double balanceAmt = (accBalance.getBalance() - accBalance.getCurrentAuth());
								balanceAmt = balanceAmt + loadCardRequest.getLoadAmount();
								accBalance.setBalance(balanceAmt);
								accBalance.setCurrentAuth(0.0);
								accBalanceRepo.save(accBalance);
								loadCardRequest.setBalance(accBalance.getBalance());
								loadCardRequest.setErrorCode("000");
							}
						} else {
							loadCardRequest.setErrorCode("014");
							loadCardRequest.setErrDescription("Card is Expired");
						}
					} else {
						loadCardRequest.setErrorCode("014");
						loadCardRequest.setErrDescription("Card is Expired");
					}
				} else {
					loadCardRequest.setErrorCode("015");
					loadCardRequest.setErrDescription("Card is inactive");
				}
			} else {
				loadCardRequest.setErrorCode("096");
				loadCardRequest.setErrDescription("Invalid Card");
			}
		} catch (Exception e) {
			e.printStackTrace();
			loadCardRequest.setErrorCode("001");
		}
	}

	private AccountBalance getAccountBalance(String bankId, String accNumber) {
		BalancePK balancePk = new BalancePK();
		balancePk.setAccNumber(accNumber);
		balancePk.setBankId(bankId);
		Optional<AccountBalance> accBalance = accBalanceRepo.findById(balancePk);
		return accBalance.get();
//		return null;
	}

	private CardAccountLink getCardAccLink(String bankId, String cardNumber) throws Exception {
		CardAccountLink cardAccLink = cardAccLinkRepo.getCardAccountLink(bankId, cardNumber);
		return cardAccLink;
	}

	@Override
	public LoadForexCardApiResponse loadForexCard(LoadForexCardRequest loadForexCardReq) throws Exception {
		List<Account> accList = new ArrayList<Account>();
		List<Transaction> txnList = null;
		List<Balances> balList = null;
		Map<String, Account> accBalMap = null;
		Map<String, Balances> balanceMap = null;
		LoadForexCardApiResponse apiResponse = new LoadForexCardApiResponse();
		apiResponse.setCardNumber(loadForexCardReq.getCardNumber());
		apiResponse.setReferenceNumber(loadForexCardReq.getReferenceNumber());
		try {
			if (loadForexCardReq.getCardNumber() != null && !loadForexCardReq.getCardNumber().isEmpty()) {
				Card card = cardRepo.findByCardPkDeviceNumber(loadForexCardReq.getCardNumber());
				if (card != null) {
					CardAccountLink cardAccLink = cardAccLinkRepo.getCardAccountLink(card.getCardPk().getBankId(),
							loadForexCardReq.getCardNumber());
					txnList = loadForexCardReq.getTransaction();
					balList = new ArrayList<Balances>();
					accBalMap = new HashMap<String, Account>();
					balanceMap = new HashMap<String, Balances>();
					if (!txnList.isEmpty()) {
						Iterator<Transaction> txnItr = txnList.iterator();
						List<Account> accBalanceList = getAllCurrencyWalletBalances(card.getCardPk().getBankId(),
								cardAccLink.getId().getAccNumber());
						for (int txnId = 0; txnId < txnList.size(); txnId++) {
							for (int i = 0; i < accBalanceList.size(); i++) {

								Transaction txnObj = txnList.get(txnId);

								if (!accBalanceList.isEmpty()) {
									Account accBalance = accBalanceList.get(i);
									String accCurrency = accBalance.getId().getCurrencyCode();
									Balances balObj = new Balances();
									if (accCurrency.equals(txnObj.getCurrency())) {
										Double balance = (accBalance.getBalance() - accBalance.getCurrentAuth());
										balance = balance + txnObj.getLoadAmt();
										accBalance.setBalance(balance);
										accBalance.setCurrentAuth(0.0);
										// accList.add(accBalance);
										accBalMap.put(accCurrency, accBalance);
										balObj.setAmount(balance);
									} else {
										Double balance = (accBalance.getBalance() - accBalance.getCurrentAuth());
										balObj.setAmount(balance);
									}
									balObj.setCurrencyCode(accCurrency);
									// balList.add(balObj);
									balanceMap.put(accCurrency, balObj);
								}
							}
						}
					}
					if (!balanceMap.isEmpty()) {
						Iterator itr = balanceMap.entrySet().iterator();
						while (itr.hasNext()) {
							Map.Entry<String, Balances> entry = (Entry<String, Balances>) itr.next();
							balList.add(entry.getValue());
						}

						itr = accBalMap.entrySet().iterator();
						while (itr.hasNext()) {
							Map.Entry<String, Account> entry = (Entry<String, Account>) itr.next();
							accList.add(entry.getValue());
						}

						accountRepo.saveAll(accList);
						apiResponse.setStatus("SUCCESS");
						apiResponse.setBalances(balList);
					}
				} else {
					// Invalid Card
				}

			}
		} finally {
			balanceMap = null;
			accBalMap = null;
			accList = null;
			txnList = null;
		}

		return apiResponse;
	}

	private List<Account> getAllCurrencyWalletBalances(String bankId, String accNumber) {
		return accountRepo.findByIdBankIdAndIdAccNumber(bankId, accNumber);
	}

}
