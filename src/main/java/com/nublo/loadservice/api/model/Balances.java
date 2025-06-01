/**
 * 
 */
package com.nublo.loadservice.api.model;

import java.io.Serializable;

/**
 * 
 */
public class Balances implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5171586779812091794L;

	private String currencyCode;
	private Double amount;

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
