/**
 * 
 */
package com.nublo.loadservice.dao.model.pk;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * @author DELL
 *
 */
@Embeddable
public class CardBinRangePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5651099826230082317L;

	@Column(name = "BANK_ID")
	private String bankId;

	@Column(name = "MIN_RANGE")
	private String minRange;

	@Column(name = "MAX_RANGE")
	private String maxRange;

	@Column(name = "CARD_INT_LENGTH")
	private int cardIntLength;

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
	 * @return the minRange
	 */
	public String getMinRange() {
		return minRange;
	}

	/**
	 * @param minRange the minRange to set
	 */
	public void setMinRange(String minRange) {
		this.minRange = minRange;
	}

	/**
	 * @return the maxRange
	 */
	public String getMaxRange() {
		return maxRange;
	}

	/**
	 * @param maxRange the maxRange to set
	 */
	public void setMaxRange(String maxRange) {
		this.maxRange = maxRange;
	}

	/**
	 * @return the cardIntLength
	 */
	public int getCardIntLength() {
		return cardIntLength;
	}

	/**
	 * @param cardIntLength the cardIntLength to set
	 */
	public void setCardIntLength(int cardIntLength) {
		this.cardIntLength = cardIntLength;
	}

}
