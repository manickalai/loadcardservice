/**
 * 
 */
package com.nublo.loadservice.dao.model;

import java.io.Serializable;

import com.nublo.loadservice.dao.model.datetime.AbstractDateTimestampEntity;
import com.nublo.loadservice.dao.model.pk.BalancePK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * @author DELL
 *
 */
@Entity
@Table(name="ACC_01")
public class AccountBalance extends AbstractDateTimestampEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BalancePK id;

	@Column(name = "BALANCE")
	private Double balance;

	@Column(name = "BLOCKED_AMOUNT")
	private Double blockAmt;

	@Column(name = "CURRENT_TRN")
	private Double currentTrn;

	@Column(name = "CURRENT_AUTH")
	private Double currentAuth;

	@Column(name = "TRN_CUT_OFF_ID")
	private Integer trnCutOffID;

	@Column(name = "BAL_CUT_OFF_ID")
	private Integer balCutOffId;

	@Column(name = "CREDIT_TRN")
	private Integer creditTrn;

	@Column(name = "BLOCKED_CREDIT")
	private Integer blockedCredit;

	/**
	 * @return the balCutOffId
	 */
	public Integer getBalCutOffId() {
		return balCutOffId;
	}

	/**
	 * @param balCutOffId the balCutOffId to set
	 */
	public void setBalCutOffId(Integer balCutOffId) {
		this.balCutOffId = balCutOffId;
	}

	/**
	 * @return the creditTrn
	 */
	public Integer getCreditTrn() {
		return creditTrn;
	}

	/**
	 * @param creditTrn the creditTrn to set
	 */
	public void setCreditTrn(Integer creditTrn) {
		this.creditTrn = creditTrn;
	}

	/**
	 * @return the blockedCredit
	 */
	public Integer getBlockedCredit() {
		return blockedCredit;
	}

	/**
	 * @param blockedCredit the blockedCredit to set
	 */
	public void setBlockedCredit(Integer blockedCredit) {
		this.blockedCredit = blockedCredit;
	}

	/**
	 * @return the trnCutOffID
	 */
	public Integer getTrnCutOffID() {
		return trnCutOffID;
	}

	/**
	 * @param trnCutOffID the trnCutOffID to set
	 */
	public void setTrnCutOffID(Integer trnCutOffID) {
		this.trnCutOffID = trnCutOffID;
	}

	/**
	 * @return the id
	 */
	public BalancePK getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(BalancePK id) {
		this.id = id;
	}

	/**
	 * @return the balance
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	/**
	 * @return the blockAmt
	 */
	public Double getBlockAmt() {
		return blockAmt;
	}

	/**
	 * @param blockAmt the blockAmt to set
	 */
	public void setBlockAmt(Double blockAmt) {
		this.blockAmt = blockAmt;
	}

	/**
	 * @return the currentTrn
	 */
	public Double getCurrentTrn() {
		return currentTrn;
	}

	/**
	 * @param currentTrn the currentTrn to set
	 */
	public void setCurrentTrn(Double currentTrn) {
		this.currentTrn = currentTrn;
	}

	/**
	 * @return the currentAuth
	 */
	public Double getCurrentAuth() {
		return currentAuth;
	}

	/**
	 * @param currentAuth the currentAuth to set
	 */
	public void setCurrentAuth(Double currentAuth) {
		this.currentAuth = currentAuth;
	}
}
