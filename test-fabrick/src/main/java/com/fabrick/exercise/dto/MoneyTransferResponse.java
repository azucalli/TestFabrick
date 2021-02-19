package com.fabrick.exercise.dto;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import com.fabrick.exercise.models.Amount;
import com.fabrick.exercise.models.Creditor;
import com.fabrick.exercise.models.Debtor;
import com.fabrick.exercise.models.Fee;

public class MoneyTransferResponse extends ResponseModel {
	
	private String moneyTransferId;
	private String status;
	private String	direction;
	private Creditor creditor;
	private Debtor debtor;
	private String cro;
	private String	trn;
	private String uri;
	private String	description;
	private LocalDateTime createdDatetime;
	private LocalDateTime accountedDatetime;
	private Date debtorValueDate;
	private Date creditorValueDate;
	private Amount amount;
	private Boolean isUrgent;
	private Boolean isInstant;
	private String feeType;
	private String feeAccountID;
	private List<Fee> fees;
	private Boolean hasTaxRelief;	
	
		
	
	public String getMoneyTransferId() {
		return moneyTransferId;
	}
	public void setMoneyTransferId(String moneyTransferId) {
		this.moneyTransferId = moneyTransferId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public Creditor getCreditor() {
		return creditor;
	}
	public void setCreditor(Creditor creditor) {
		this.creditor = creditor;
	}
	public Debtor getDebtor() {
		return debtor;
	}
	public void setDebtor(Debtor debtor) {
		this.debtor = debtor;
	}
	public String getCro() {
		return cro;
	}
	public void setCro(String cro) {
		this.cro = cro;
	}
	public String getTrn() {
		return trn;
	}
	public void setTrn(String trn) {
		this.trn = trn;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getCreatedDatetime() {
		return createdDatetime;
	}
	public void setCreatedDatetime(LocalDateTime createdDatetime) {
		this.createdDatetime = createdDatetime;
	}
	public LocalDateTime getAccountedDatetime() {
		return accountedDatetime;
	}
	public void setAccountedDatetime(LocalDateTime accountedDatetime) {
		this.accountedDatetime = accountedDatetime;
	}
	public Date getDebtorValueDate() {
		return debtorValueDate;
	}
	public void setDebtorValueDate(Date debtorValueDate) {
		this.debtorValueDate = debtorValueDate;
	}
	public Date getCreditorValueDate() {
		return creditorValueDate;
	}
	public void setCreditorValueDate(Date creditorValueDate) {
		this.creditorValueDate = creditorValueDate;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public Boolean getIsUrgent() {
		return isUrgent;
	}
	public void setIsUrgent(Boolean isUrgent) {
		this.isUrgent = isUrgent;
	}
	public Boolean getIsInstant() {
		return isInstant;
	}
	public void setIsInstant(Boolean isInstant) {
		this.isInstant = isInstant;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public String getFeeAccountID() {
		return feeAccountID;
	}
	public void setFeeAccountID(String feeAccountID) {
		this.feeAccountID = feeAccountID;
	}
	public List<Fee> getFees() {
		return fees;
	}
	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}
	public Boolean getHasTaxRelief() {
		return hasTaxRelief;
	}
	public void setHasTaxRelief(Boolean hasTaxRelief) {
		this.hasTaxRelief = hasTaxRelief;
	}
	
	
	
		
}
	

	
