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
public class CardPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "BANK_ID")
	private String bankId;

	@Column(name = "DEVICE_NUMBER")
	private String deviceNumber;



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

	public String getDeviceNumber() {
		return deviceNumber;
	}

	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}

	
}
