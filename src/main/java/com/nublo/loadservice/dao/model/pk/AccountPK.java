/**
 * 
 */
package com.nublo.loadservice.dao.model.pk;

import java.io.Serializable;

import jakarta.persistence.Column;

/**
 * @author DELL
 *
 */
public class AccountPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "BANK_ID")
	private String bankId;

	@Column(name = "EWALLET_NUMBER")
	private String accNumber;

	@Column(name = "CURRENCY_CODE")
	private String currencyCode;

	/**
	 * @return the bankId
	 */
	public String getBankId() {
		return bankId;
	}

	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	/**
	 * @return the accNumber
	 */
	public String getAccNumber() {
		return accNumber;
	}

	/**
	 * @param accNumber the accNumber to set
	 */
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}
