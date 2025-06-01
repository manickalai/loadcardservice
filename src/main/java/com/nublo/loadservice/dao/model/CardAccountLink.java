/**
 * 
 */
package com.nublo.loadservice.dao.model;

import java.io.Serializable;

import com.nublo.loadservice.dao.model.datetime.AbstractDateTimestampEntity;
import com.nublo.loadservice.dao.model.pk.CardAccountPK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * @author DELL
 *
 */
@Entity
@Table(name="CRD_03")
public class CardAccountLink extends AbstractDateTimestampEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CardAccountPK id;

	@Column(name = "CLIENT_CODE")
	private String clientCode;

	@Column(name = "PROGRAM_CODE")
	private String programId;

	@Column(name = "APPLICATION_NUMBER")
	private String applicationNumber;

	@Column(name = "PARENT_CLIENT_CODE")
	private String parentClientCode;

	@Column(name = "RELATION_WITH_PRIMARY_CLIENT")
	private String relPrimaryClient;

	@Column(name = "BATCH_NUMBER")
	private String batchNumber;

	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "DEFAULT_ACCOUNT")
	private String defaultAcc;

	@Column(name = "ACC_TYPE")
	private String accType;

	public String getStatus() {
		return status;
	}

	public String getParentClientCode() {
		return parentClientCode;
	}

	public void setParentClientCode(String parentClientCode) {
		this.parentClientCode = parentClientCode;
	}

	public String getRelPrimaryClient() {
		return relPrimaryClient;
	}

	public void setRelPrimaryClient(String relPrimaryClient) {
		this.relPrimaryClient = relPrimaryClient;
	}

	public String getDefaultAcc() {
		return defaultAcc;
	}

	public void setDefaultAcc(String defaultAcc) {
		this.defaultAcc = defaultAcc;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the id
	 */
	public CardAccountPK getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(CardAccountPK id) {
		this.id = id;
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

}
