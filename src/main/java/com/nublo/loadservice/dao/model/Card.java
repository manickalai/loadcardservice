/**
 * 
 */
package com.nublo.loadservice.dao.model;

import java.io.Serializable;
import java.util.Date;

import com.nublo.loadservice.dao.model.datetime.AbstractDateTimestampEntity;
import com.nublo.loadservice.dao.model.pk.CardPK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * @author DELL
 *
 */
@Entity
@Table(name = "CRD_01")
public class Card extends AbstractDateTimestampEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CardPK cardPk;
	
	@Column(name = "AGENT_LINK")
	private String agentLink = "N";

	@Column(name = "CUSTOMER_LINK")
	private String customerLink = "N";

	@Column(name = "DEVICE_PLAN_ID")
	private String devicePlanId;

	@Column(name = "DEVICE_PROMO_PLAN_ID")
	private String devicePromoPlanId;

	@Column(name = "BASIC_DEVICE_NUMBER")
	private String basicDeviceNumber;

	@Column(name = "ACTIVATION_DT")
	private Date activationDt;

	@Column(name = "APPLICATION_NUMBER")
	private String applicationNumber;

	@Column(name = "CARD_RECEIVED_BY")
	private String cardReceivedBy;

	@Column(name = "CLIENT_CODE")
	private String clientCode;

	@Column(name = "CLOSING_DT")
	private Date closingDt;

	@Column(name = "DEFAULT_EWALLET_NO")
	private String defaultEwalletNo;

	@Column(name = "DELIVERY_DT")
	private Date deliverDt;

	@Column(name = "DELIVERY_FLAG")
	private int deliveyFlag = 0;

	@Column(name = "DEVICE_EVT_FEE_PLAN_ID_ADDON")
	private String deviceEvtFeePlanIdAddon;

	@Column(name = "DEVICE_EVT_FEE_PLAN_ID_PRIM")
	private String deviceEvtServiceFeePlanId;

	@Column(name = "DEVICE_MNT_FEE_PLAN_ID_ADDON")
	private String deviceMntFeePlanIdAddon;

	@Column(name = "DEVICE_MNT_FEE_PLAN_ID_PRIM")
	private String deviceMntFeePlanIdPrim;

	@Column(name = "EXPIRY_DT")
	private Date expiryDate;

	@Column(name = "FORMER_EXPIRY_DT")
	private Date formerExpiryDt;

	@Column(name = "LAST_BATCH_PROD_NUMBER")
	private int lastBatchProdNum = 0;

	@Column(name = "LAST_BILLING_DT")
	private Date lastBillingDt;

	@Column(name = "LAST_PROD_DT")
	private Date lastProdDt;

	@Column(name = "LINKED_DEVICE_NUMBER")
	private String linkedDeviceNumber;

	@Column(name = "LVC_FLAG")
	private String lvcFlag;

	@Column(name = "LVC_PER_TXN_LIMIT")
	private int lvcPerTxnLimit = 0;

	@Column(name = "LVC_TOTAL_TXN_AMT_LIMIT")
	private int lvcTotalTxnAmtLimit = 0;

	@Column(name = "LVC_TOTAL_VELOCITY")
	private int lvcTotalVelocity = 0;

	@Column(name = "NEXT_BILLING_DT")
	private Date nextBillingDt;

	@Column(name = "OPENING_DT")
	private Date openingDt;

	@Column(name = "PHOTO_INDICATOR")
	private String photoIndicator;

	@Column(name = "PIN_PRODUCTION_COUNT")
	private int pinProductionCount = 0;

	@Column(name = "PRE_GENERATED_CARD")
	private String preGeneratedCard;

	@Column(name = "RENEWAL_OPTION")
	private String renewalOption;

	@Column(name = "SALE_DT")
	private Date saleDt;

	@Column(name = "SIGN_UP_POSTED_DT")
	private Date signUpPostedDt;

	@Column(name = "START_VAL_DT")
	private Date startValDt;

	@Column(name = "STATUS_CODE")
	private int statusCode;

	@Column(name = "STATUS_DT")
	private Date statusDt;

	@Column(name = "TXN_FEE_PLAN_ID")
	private String txnFeePlanId;

	@Column(name = "TXN_FEE_WAIVER_PLAN_ID")
	private String txnFeeWaiverPlanId;

	@Column(name = "TXN_LIMIT_PLAN_ID")
	private String txnLimitPlanId;

	@Column(name = "PROGRAM_ID")
	private String programId;

	@Column(name = "DEVICE_SEQUENCE_NUMBER")
	private String deviceSequenceNumber;

	@Column(name = "BATCH_NUMBER")
	private String batchNumber;

	@Column(name = "PRIMARY_TRANSACTION_SET_ID")
	private String primaryTransactionSetId;

	@Column(name = "OWNER_CODE")
	private String ownerCode;

	@Column(name = "BASIC_CARD_FLAG")
	private String basicCardFlag;

	@Column(name = "DEVICE_BOARDING_DATE")
	private Date deviceBoardingDate;

	@Column(name = "TARIFF_CODE")
	private String tariffCode;

	@Column(name = "ACTION_CODE")
	private String actionCode;

	@Column(name = "MACHINE_FILE")
	private String machineFileName;

	@Column(name = "PRIMARY_CARD_NO")
	private String primaryCardNo;

	@Column(name = "PICTURE_FILE_NAME")
	private String pictureFileName;

	@Column(name = "PHOTO_FILE_NAME")
	private String photoFileName;

	@Column(name = "EMBOSSED_NAME")
	private String embossedName;

	@Column(name = "ENCODED_NAME")
	private String encodedName;

	@Column(name = "EMBOSSED_LINE4")
	private String embossedLine4;

	@Column(name = "EMBOSSED_LINE3")
	private String embossedLine3;

	@Column(name = "OLD_DEVICE_NUMBER")
	private String oldCardNumber;

	@Column(name = "CARD_PACK_ID")
	private String cardPackId;

	@Column(name = "PRIMARY_CARD_FLAG")
	private String primaryCardFlag;

	/**
	 * @return the cardPk
	 */
	public CardPK getCardPk() {
		return cardPk;
	}

	/**
	 * @param cardPk the cardPk to set
	 */
	public void setCardPk(CardPK cardPk) {
		this.cardPk = cardPk;
	}

	/**
	 * @return the devicePlanId
	 */
	public String getDevicePlanId() {
		return devicePlanId;
	}

	/**
	 * @param devicePlanId the devicePlanId to set
	 */
	public void setDevicePlanId(String devicePlanId) {
		this.devicePlanId = devicePlanId;
	}

	/**
	 * @return the devicePromoPlanId
	 */
	public String getDevicePromoPlanId() {
		return devicePromoPlanId;
	}

	/**
	 * @param devicePromoPlanId the devicePromoPlanId to set
	 */
	public void setDevicePromoPlanId(String devicePromoPlanId) {
		this.devicePromoPlanId = devicePromoPlanId;
	}

	/**
	 * @return the basicDeviceNumber
	 */
	public String getBasicDeviceNumber() {
		return basicDeviceNumber;
	}

	/**
	 * @param basicDeviceNumber the basicDeviceNumber to set
	 */
	public void setBasicDeviceNumber(String basicDeviceNumber) {
		this.basicDeviceNumber = basicDeviceNumber;
	}

	/**
	 * @return the activationDt
	 */
	public Date getActivationDt() {
		return activationDt;
	}

	/**
	 * @param activationDt the activationDt to set
	 */
	public void setActivationDt(Date activationDt) {
		this.activationDt = activationDt;
	}

	/**
	 * @return the applicationNumber
	 */
	public String getApplicationNumber() {
		return applicationNumber;
	}

	/**
	 * @param applicationNumber the applicationNumber to set
	 */
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	/**
	 * @return the cardReceivedBy
	 */
	public String getCardReceivedBy() {
		return cardReceivedBy;
	}

	/**
	 * @param cardReceivedBy the cardReceivedBy to set
	 */
	public void setCardReceivedBy(String cardReceivedBy) {
		this.cardReceivedBy = cardReceivedBy;
	}

	/**
	 * @return the clientCode
	 */
	public String getClientCode() {
		return clientCode;
	}

	/**
	 * @param clientCode the clientCode to set
	 */
	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	/**
	 * @return the closingDt
	 */
	public Date getClosingDt() {
		return closingDt;
	}

	/**
	 * @param closingDt the closingDt to set
	 */
	public void setClosingDt(Date closingDt) {
		this.closingDt = closingDt;
	}

	/**
	 * @return the defaultEwalletNo
	 */
	public String getDefaultEwalletNo() {
		return defaultEwalletNo;
	}

	/**
	 * @param defaultEwalletNo the defaultEwalletNo to set
	 */
	public void setDefaultEwalletNo(String defaultEwalletNo) {
		this.defaultEwalletNo = defaultEwalletNo;
	}

	/**
	 * @return the deliverDt
	 */
	public Date getDeliverDt() {
		return deliverDt;
	}

	/**
	 * @param deliverDt the deliverDt to set
	 */
	public void setDeliverDt(Date deliverDt) {
		this.deliverDt = deliverDt;
	}

	/**
	 * @return the deliveyFlag
	 */
	public int getDeliveyFlag() {
		return deliveyFlag;
	}

	/**
	 * @param deliveyFlag the deliveyFlag to set
	 */
	public void setDeliveyFlag(int deliveyFlag) {
		this.deliveyFlag = deliveyFlag;
	}

	/**
	 * @return the deviceEvtFeePlanIdAddon
	 */
	public String getDeviceEvtFeePlanIdAddon() {
		return deviceEvtFeePlanIdAddon;
	}

	/**
	 * @param deviceEvtFeePlanIdAddon the deviceEvtFeePlanIdAddon to set
	 */
	public void setDeviceEvtFeePlanIdAddon(String deviceEvtFeePlanIdAddon) {
		this.deviceEvtFeePlanIdAddon = deviceEvtFeePlanIdAddon;
	}

	/**
	 * @return the deviceEvtServiceFeePlanId
	 */
	public String getDeviceEvtServiceFeePlanId() {
		return deviceEvtServiceFeePlanId;
	}

	/**
	 * @param deviceEvtServiceFeePlanId the deviceEvtServiceFeePlanId to set
	 */
	public void setDeviceEvtServiceFeePlanId(String deviceEvtServiceFeePlanId) {
		this.deviceEvtServiceFeePlanId = deviceEvtServiceFeePlanId;
	}

	/**
	 * @return the deviceMntFeePlanIdAddon
	 */
	public String getDeviceMntFeePlanIdAddon() {
		return deviceMntFeePlanIdAddon;
	}

	/**
	 * @param deviceMntFeePlanIdAddon the deviceMntFeePlanIdAddon to set
	 */
	public void setDeviceMntFeePlanIdAddon(String deviceMntFeePlanIdAddon) {
		this.deviceMntFeePlanIdAddon = deviceMntFeePlanIdAddon;
	}

	/**
	 * @return the deviceMntFeePlanIdPrim
	 */
	public String getDeviceMntFeePlanIdPrim() {
		return deviceMntFeePlanIdPrim;
	}

	/**
	 * @param deviceMntFeePlanIdPrim the deviceMntFeePlanIdPrim to set
	 */
	public void setDeviceMntFeePlanIdPrim(String deviceMntFeePlanIdPrim) {
		this.deviceMntFeePlanIdPrim = deviceMntFeePlanIdPrim;
	}

	/**
	 * @return the expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the formerExpiryDt
	 */
	public Date getFormerExpiryDt() {
		return formerExpiryDt;
	}

	/**
	 * @param formerExpiryDt the formerExpiryDt to set
	 */
	public void setFormerExpiryDt(Date formerExpiryDt) {
		this.formerExpiryDt = formerExpiryDt;
	}

	/**
	 * @return the lastBatchProdNum
	 */
	public int getLastBatchProdNum() {
		return lastBatchProdNum;
	}

	/**
	 * @param lastBatchProdNum the lastBatchProdNum to set
	 */
	public void setLastBatchProdNum(int lastBatchProdNum) {
		this.lastBatchProdNum = lastBatchProdNum;
	}

	/**
	 * @return the lastBillingDt
	 */
	public Date getLastBillingDt() {
		return lastBillingDt;
	}

	/**
	 * @param lastBillingDt the lastBillingDt to set
	 */
	public void setLastBillingDt(Date lastBillingDt) {
		this.lastBillingDt = lastBillingDt;
	}

	/**
	 * @return the lastProdDt
	 */
	public Date getLastProdDt() {
		return lastProdDt;
	}

	/**
	 * @param lastProdDt the lastProdDt to set
	 */
	public void setLastProdDt(Date lastProdDt) {
		this.lastProdDt = lastProdDt;
	}

	/**
	 * @return the linkedDeviceNumber
	 */
	public String getLinkedDeviceNumber() {
		return linkedDeviceNumber;
	}

	/**
	 * @param linkedDeviceNumber the linkedDeviceNumber to set
	 */
	public void setLinkedDeviceNumber(String linkedDeviceNumber) {
		this.linkedDeviceNumber = linkedDeviceNumber;
	}

	/**
	 * @return the lvcFlag
	 */
	public String getLvcFlag() {
		return lvcFlag;
	}

	/**
	 * @param lvcFlag the lvcFlag to set
	 */
	public void setLvcFlag(String lvcFlag) {
		this.lvcFlag = lvcFlag;
	}

	/**
	 * @return the lvcPerTxnLimit
	 */
	public int getLvcPerTxnLimit() {
		return lvcPerTxnLimit;
	}

	/**
	 * @param lvcPerTxnLimit the lvcPerTxnLimit to set
	 */
	public void setLvcPerTxnLimit(int lvcPerTxnLimit) {
		this.lvcPerTxnLimit = lvcPerTxnLimit;
	}

	/**
	 * @return the lvcTotalTxnAmtLimit
	 */
	public int getLvcTotalTxnAmtLimit() {
		return lvcTotalTxnAmtLimit;
	}

	/**
	 * @param lvcTotalTxnAmtLimit the lvcTotalTxnAmtLimit to set
	 */
	public void setLvcTotalTxnAmtLimit(int lvcTotalTxnAmtLimit) {
		this.lvcTotalTxnAmtLimit = lvcTotalTxnAmtLimit;
	}

	/**
	 * @return the lvcTotalVelocity
	 */
	public int getLvcTotalVelocity() {
		return lvcTotalVelocity;
	}

	/**
	 * @param lvcTotalVelocity the lvcTotalVelocity to set
	 */
	public void setLvcTotalVelocity(int lvcTotalVelocity) {
		this.lvcTotalVelocity = lvcTotalVelocity;
	}

	/**
	 * @return the nextBillingDt
	 */
	public Date getNextBillingDt() {
		return nextBillingDt;
	}

	/**
	 * @param nextBillingDt the nextBillingDt to set
	 */
	public void setNextBillingDt(Date nextBillingDt) {
		this.nextBillingDt = nextBillingDt;
	}

	/**
	 * @return the openingDt
	 */
	public Date getOpeningDt() {
		return openingDt;
	}

	/**
	 * @param openingDt the openingDt to set
	 */
	public void setOpeningDt(Date openingDt) {
		this.openingDt = openingDt;
	}

	/**
	 * @return the photoIndicator
	 */
	public String getPhotoIndicator() {
		return photoIndicator;
	}

	/**
	 * @param photoIndicator the photoIndicator to set
	 */
	public void setPhotoIndicator(String photoIndicator) {
		this.photoIndicator = photoIndicator;
	}

	/**
	 * @return the pinProductionCount
	 */
	public int getPinProductionCount() {
		return pinProductionCount;
	}

	/**
	 * @param pinProductionCount the pinProductionCount to set
	 */
	public void setPinProductionCount(int pinProductionCount) {
		this.pinProductionCount = pinProductionCount;
	}

	/**
	 * @return the preGeneratedCard
	 */
	public String getPreGeneratedCard() {
		return preGeneratedCard;
	}

	/**
	 * @param preGeneratedCard the preGeneratedCard to set
	 */
	public void setPreGeneratedCard(String preGeneratedCard) {
		this.preGeneratedCard = preGeneratedCard;
	}

	/**
	 * @return the renewalOption
	 */
	public String getRenewalOption() {
		return renewalOption;
	}

	/**
	 * @param renewalOption the renewalOption to set
	 */
	public void setRenewalOption(String renewalOption) {
		this.renewalOption = renewalOption;
	}

	/**
	 * @return the saleDt
	 */
	public Date getSaleDt() {
		return saleDt;
	}

	/**
	 * @param saleDt the saleDt to set
	 */
	public void setSaleDt(Date saleDt) {
		this.saleDt = saleDt;
	}

	/**
	 * @return the signUpPostedDt
	 */
	public Date getSignUpPostedDt() {
		return signUpPostedDt;
	}

	/**
	 * @param signUpPostedDt the signUpPostedDt to set
	 */
	public void setSignUpPostedDt(Date signUpPostedDt) {
		this.signUpPostedDt = signUpPostedDt;
	}

	/**
	 * @return the startValDt
	 */
	public Date getStartValDt() {
		return startValDt;
	}

	/**
	 * @param startValDt the startValDt to set
	 */
	public void setStartValDt(Date startValDt) {
		this.startValDt = startValDt;
	}

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the statusDt
	 */
	public Date getStatusDt() {
		return statusDt;
	}

	/**
	 * @param statusDt the statusDt to set
	 */
	public void setStatusDt(Date statusDt) {
		this.statusDt = statusDt;
	}

	/**
	 * @return the txnFeePlanId
	 */
	public String getTxnFeePlanId() {
		return txnFeePlanId;
	}

	/**
	 * @param txnFeePlanId the txnFeePlanId to set
	 */
	public void setTxnFeePlanId(String txnFeePlanId) {
		this.txnFeePlanId = txnFeePlanId;
	}

	/**
	 * @return the txnFeeWaiverPlanId
	 */
	public String getTxnFeeWaiverPlanId() {
		return txnFeeWaiverPlanId;
	}

	/**
	 * @param txnFeeWaiverPlanId the txnFeeWaiverPlanId to set
	 */
	public void setTxnFeeWaiverPlanId(String txnFeeWaiverPlanId) {
		this.txnFeeWaiverPlanId = txnFeeWaiverPlanId;
	}

	/**
	 * @return the txnLimitPlanId
	 */
	public String getTxnLimitPlanId() {
		return txnLimitPlanId;
	}

	/**
	 * @param txnLimitPlanId the txnLimitPlanId to set
	 */
	public void setTxnLimitPlanId(String txnLimitPlanId) {
		this.txnLimitPlanId = txnLimitPlanId;
	}

	/**
	 * @return the programId
	 */
	public String getProgramId() {
		return programId;
	}

	/**
	 * @param programId the programId to set
	 */
	public void setProgramId(String programId) {
		this.programId = programId;
	}

	/**
	 * @return the deviceSequenceNumber
	 */
	public String getDeviceSequenceNumber() {
		return deviceSequenceNumber;
	}

	/**
	 * @param deviceSequenceNumber the deviceSequenceNumber to set
	 */
	public void setDeviceSequenceNumber(String deviceSequenceNumber) {
		this.deviceSequenceNumber = deviceSequenceNumber;
	}

	/**
	 * @return the batchNumber
	 */
	public String getBatchNumber() {
		return batchNumber;
	}

	/**
	 * @param batchNumber the batchNumber to set
	 */
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	/**
	 * @return the primaryTransactionSetId
	 */
	public String getPrimaryTransactionSetId() {
		return primaryTransactionSetId;
	}

	/**
	 * @param primaryTransactionSetId the primaryTransactionSetId to set
	 */
	public void setPrimaryTransactionSetId(String primaryTransactionSetId) {
		this.primaryTransactionSetId = primaryTransactionSetId;
	}

	/**
	 * @return the ownerCode
	 */
	public String getOwnerCode() {
		return ownerCode;
	}

	/**
	 * @param ownerCode the ownerCode to set
	 */
	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}

	/**
	 * @return the basicCardFlag
	 */
	public String getBasicCardFlag() {
		return basicCardFlag;
	}

	/**
	 * @param basicCardFlag the basicCardFlag to set
	 */
	public void setBasicCardFlag(String basicCardFlag) {
		this.basicCardFlag = basicCardFlag;
	}

	/**
	 * @return the deviceBoardingDate
	 */
	public Date getDeviceBoardingDate() {
		return deviceBoardingDate;
	}

	/**
	 * @param deviceBoardingDate the deviceBoardingDate to set
	 */
	public void setDeviceBoardingDate(Date deviceBoardingDate) {
		this.deviceBoardingDate = deviceBoardingDate;
	}

	/**
	 * @return the tariffCode
	 */
	public String getTariffCode() {
		return tariffCode;
	}

	/**
	 * @param tariffCode the tariffCode to set
	 */
	public void setTariffCode(String tariffCode) {
		this.tariffCode = tariffCode;
	}

	/**
	 * @return the actionCode
	 */
	public String getActionCode() {
		return actionCode;
	}

	/**
	 * @param actionCode the actionCode to set
	 */
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	/**
	 * @return the machineFileName
	 */
	public String getMachineFileName() {
		return machineFileName;
	}

	/**
	 * @param machineFileName the machineFileName to set
	 */
	public void setMachineFileName(String machineFileName) {
		this.machineFileName = machineFileName;
	}

	/**
	 * @return the primaryCardNo
	 */
	public String getPrimaryCardNo() {
		return primaryCardNo;
	}

	/**
	 * @param primaryCardNo the primaryCardNo to set
	 */
	public void setPrimaryCardNo(String primaryCardNo) {
		this.primaryCardNo = primaryCardNo;
	}

	/**
	 * @return the pictureFileName
	 */
	public String getPictureFileName() {
		return pictureFileName;
	}

	/**
	 * @param pictureFileName the pictureFileName to set
	 */
	public void setPictureFileName(String pictureFileName) {
		this.pictureFileName = pictureFileName;
	}

	/**
	 * @return the photoFileName
	 */
	public String getPhotoFileName() {
		return photoFileName;
	}

	/**
	 * @param photoFileName the photoFileName to set
	 */
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	/**
	 * @return the embossedName
	 */
	public String getEmbossedName() {
		return embossedName;
	}

	/**
	 * @param embossedName the embossedName to set
	 */
	public void setEmbossedName(String embossedName) {
		this.embossedName = embossedName;
	}

	/**
	 * @return the encodedName
	 */
	public String getEncodedName() {
		return encodedName;
	}

	/**
	 * @param encodedName the encodedName to set
	 */
	public void setEncodedName(String encodedName) {
		this.encodedName = encodedName;
	}

	/**
	 * @return the embossedLine4
	 */
	public String getEmbossedLine4() {
		return embossedLine4;
	}

	/**
	 * @param embossedLine4 the embossedLine4 to set
	 */
	public void setEmbossedLine4(String embossedLine4) {
		this.embossedLine4 = embossedLine4;
	}

	/**
	 * @return the embossedLine3
	 */
	public String getEmbossedLine3() {
		return embossedLine3;
	}

	/**
	 * @param embossedLine3 the embossedLine3 to set
	 */
	public void setEmbossedLine3(String embossedLine3) {
		this.embossedLine3 = embossedLine3;
	}

	/**
	 * @return the oldCardNumber
	 */
	public String getOldCardNumber() {
		return oldCardNumber;
	}

	/**
	 * @param oldCardNumber the oldCardNumber to set
	 */
	public void setOldCardNumber(String oldCardNumber) {
		this.oldCardNumber = oldCardNumber;
	}

	/**
	 * @return the cardPackId
	 */
	public String getCardPackId() {
		return cardPackId;
	}

	/**
	 * @param cardPackId the cardPackId to set
	 */
	public void setCardPackId(String cardPackId) {
		this.cardPackId = cardPackId;
	}

	/**
	 * @return the primaryCardFlag
	 */
	public String getPrimaryCardFlag() {
		return primaryCardFlag;
	}

	/**
	 * @param primaryCardFlag the primaryCardFlag to set
	 */
	public void setPrimaryCardFlag(String primaryCardFlag) {
		this.primaryCardFlag = primaryCardFlag;
	}

	public String getAgentLink() {
		return agentLink;
	}

	public void setAgentLink(String agentLink) {
		this.agentLink = agentLink;
	}

	public String getCustomerLink() {
		return customerLink;
	}

	public void setCustomerLink(String customerLink) {
		this.customerLink = customerLink;
	}

}
