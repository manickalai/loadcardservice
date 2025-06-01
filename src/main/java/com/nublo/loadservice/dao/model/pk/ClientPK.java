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
public class ClientPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "BANK_ID")
	private String bankId;

	@Column(name = "CLIENT_CODE")
	private String clientCode;

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

	public String getClientCode() {
		return this.clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}
}