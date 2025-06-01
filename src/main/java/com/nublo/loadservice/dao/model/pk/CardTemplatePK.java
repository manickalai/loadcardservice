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
public class CardTemplatePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3430830328907962146L;

	@Column(name = "BANK_ID")
	private String bankId;

	@Column(name = "TEMPLATE_ID")
	private String templateId;

	@Column(name = "DEVICE_TYPE")
	private String deviceType;

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
	 * @return the templateId
	 */
	public String getTemplateId() {
		return templateId;
	}

	/**
	 * @param templateId the templateId to set
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	/**
	 * @return the deviceType
	 */
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * @param deviceType the deviceType to set
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

}
