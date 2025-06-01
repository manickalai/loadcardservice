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
public class CardPlanPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7668230697951847449L;

	@Column(name = "BANK_ID")
	private String bankId;

	@Column(name = "DEVICE_PLAN_ID")
	private String cardPlanId;

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
	 * @return the cardPlanId
	 */
	public String getCardPlanId() {
		return cardPlanId;
	}

	/**
	 * @param cardPlanId the cardPlanId to set
	 */
	public void setCardPlanId(String cardPlanId) {
		this.cardPlanId = cardPlanId;
	}

}
