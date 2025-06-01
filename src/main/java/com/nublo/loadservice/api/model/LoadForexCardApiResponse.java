/**
 * 
 */
package com.nublo.loadservice.api.model;

import java.io.Serializable;
import java.util.List;

/**
 * 
 */
public class LoadForexCardApiResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4060065290486401814L;

	private String cardNumber;
	private String status;
	private String referenceNumber;
	private String statusReason;
	private String errorCode;
	private Double feeAmount;
	private List<Balances> balances;

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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @return the statusReason
	 */
	public String getStatusReason() {
		return statusReason;
	}

	/**
	 * @param statusReason the statusReason to set
	 */
	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the feeAmount
	 */
	public Double getFeeAmount() {
		return feeAmount;
	}

	/**
	 * @param feeAmount the feeAmount to set
	 */
	public void setFeeAmount(Double feeAmount) {
		this.feeAmount = feeAmount;
	}

	/**
	 * @return the balances
	 */
	public List<Balances> getBalances() {
		return balances;
	}

	/**
	 * @param balances the balances to set
	 */
	public void setBalances(List<Balances> balances) {
		this.balances = balances;
	}

}
