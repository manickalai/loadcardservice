/**
 * 
 */
package com.nublo.loadservice.api.model;

import java.io.Serializable;

/**
 * 
 */
public class Transaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1383161883958812166L;

	private String currency;
	private Double loadAmt;

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the loadAmt
	 */
	public Double getLoadAmt() {
		return loadAmt;
	}

	/**
	 * @param loadAmt the loadAmt to set
	 */
	public void setLoadAmt(Double loadAmt) {
		this.loadAmt = loadAmt;
	}

}
