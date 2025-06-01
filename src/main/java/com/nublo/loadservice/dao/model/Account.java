/**
 * 
 */
package com.nublo.loadservice.dao.model;

import java.io.Serializable;
import java.util.Date;

import com.nublo.loadservice.dao.model.datetime.AbstractDateTimestampEntity;
import com.nublo.loadservice.dao.model.pk.AccountPK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * @author DELL
 *
 */
@Entity
@Table(name = "ACC_02")
public class Account extends AbstractDateTimestampEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AccountPK id;

	@Column(name = "EWALLET_PLAN_ID")
	private String ewalletPlanId;

	@Column(name = "PROGRAM_CODE")
	private String programCode;

	@Column(name = "CLIENT_CODE")
	private String clientCode;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "PRIORITY")
	private int priority;

	@Column(name = "LAST_STMT_PROC_DT")
	private Date lastStmtProcDt;

	@Column(name = "DEFAULT_EWALLET")
	private String defaultEwallet;

	@Column(name = "LAST_INACTIVITY_FEE_DT")
	private Date lastInactivityFeeDt;

	@Column(name = "EWALLET_CLOSING_DT")
	private Date ewalletClosingDt;

	@Column(name = "LAST_BILLING_DT")
	private Date lastBillingDt;

	@Column(name = "START_DT")
	private Date startDt;

	@Column(name = "DORMANCY_REASON")
	private double dormancyReason;

	@Column(name = "PREVIOUS_EWALLET_STATUS")
	private String previousEwalletStatus;

	@Column(name = "DORMANCY_DT")
	private Date dormancyDt;

	@Column(name = "NEXT_BILLING_DT")
	private Date nextBillingDt;

	@Column(name = "BATCH_NUMBER")
	private String batchNumber;

	@Column(name = "ACC_TYPE")
	private String accType;

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

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getEwalletPlanId() {
		return ewalletPlanId;
	}

	public void setEwalletPlanId(String ewalletPlanId) {
		this.ewalletPlanId = ewalletPlanId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getLastStmtProcDt() {
		return lastStmtProcDt;
	}

	public void setLastStmtProcDt(Date lastStmtProcDt) {
		this.lastStmtProcDt = lastStmtProcDt;
	}

	public String getDefaultEwallet() {
		return defaultEwallet;
	}

	public void setDefaultEwallet(String defaultEwallet) {
		this.defaultEwallet = defaultEwallet;
	}

	public Date getLastInactivityFeeDt() {
		return lastInactivityFeeDt;
	}

	public void setLastInactivityFeeDt(Date lastInactivityFeeDt) {
		this.lastInactivityFeeDt = lastInactivityFeeDt;
	}

	public Date getEwalletClosingDt() {
		return ewalletClosingDt;
	}

	public void setEwalletClosingDt(Date ewalletClosingDt) {
		this.ewalletClosingDt = ewalletClosingDt;
	}

	public Date getLastBillingDt() {
		return lastBillingDt;
	}

	public void setLastBillingDt(Date lastBillingDt) {
		this.lastBillingDt = lastBillingDt;
	}

	public Date getStartDt() {
		return startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public double getDormancyReason() {
		return dormancyReason;
	}

	public void setDormancyReason(double dormancyReason) {
		this.dormancyReason = dormancyReason;
	}

	public String getPreviousEwalletStatus() {
		return previousEwalletStatus;
	}

	public void setPreviousEwalletStatus(String previousEwalletStatus) {
		this.previousEwalletStatus = previousEwalletStatus;
	}

	public Date getDormancyDt() {
		return dormancyDt;
	}

	public void setDormancyDt(Date dormancyDt) {
		this.dormancyDt = dormancyDt;
	}

	public Date getNextBillingDt() {
		return nextBillingDt;
	}

	public void setNextBillingDt(Date nextBillingDt) {
		this.nextBillingDt = nextBillingDt;
	}

	public String getProgramCode() {
		return programCode;
	}

	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public AccountPK getId() {
		return id;
	}

	public void setId(AccountPK id) {
		this.id = id;
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
