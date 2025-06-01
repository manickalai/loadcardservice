/**
 * 
 */
package com.nublo.loadservice.api.model;

import java.io.Serializable;
import java.util.List;

/**
 * 
 */
public class LoadForexCardRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4060065290486401814L;
	
	
	private String institutionId;
	private String kitId;
	private String cardNumber;
	private String referenceNumber;
	private String note;
	private String sourceChannel;
	private String branchId;
	private String purposeCode;
	private List<Transaction> transaction;

	/**
	 * @return the institutionId
	 */
	public String getInstitutionId() {
		return institutionId;
	}

	/**
	 * @param institutionId the institutionId to set
	 */
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	/**
	 * @return the kitId
	 */
	public String getKitId() {
		return kitId;
	}

	/**
	 * @param kitId the kitId to set
	 */
	public void setKitId(String kitId) {
		this.kitId = kitId;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the referenceNumber
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * @param referenceNumber the referenceNumber to set
	 */
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the sourceChannel
	 */
	public String getSourceChannel() {
		return sourceChannel;
	}

	/**
	 * @param sourceChannel the sourceChannel to set
	 */
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	/**
	 * @return the branchId
	 */
	public String getBranchId() {
		return branchId;
	}

	/**
	 * @param branchId the branchId to set
	 */
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	/**
	 * @return the purposeCode
	 */
	public String getPurposeCode() {
		return purposeCode;
	}

	/**
	 * @param purposeCode the purposeCode to set
	 */
	public void setPurposeCode(String purposeCode) {
		this.purposeCode = purposeCode;
	}

	/**
	 * @return the transaction
	 */
	public List<Transaction> getTransaction() {
		return transaction;
	}

	/**
	 * @param transaction the transaction to set
	 */
	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	
}
