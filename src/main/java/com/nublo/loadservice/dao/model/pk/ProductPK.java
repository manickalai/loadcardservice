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
public class ProductPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2662312877554364773L;

	@Column(name = "BANK_ID")
	private String bankId;

	@Column(name = "PROGRAM_CODE")
	private String programId;

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

}
