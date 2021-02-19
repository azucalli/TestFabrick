package com.fabrick.exercise.dto;

import com.fabrick.exercise.models.Creditor;
import com.fabrick.exercise.models.TaxRelief;

public class MoneyTransferRequest {

	private Creditor creditor;
	private String executionDate;
	private String uri;
	private String description;
	private Number amount;
	private String currency;
	private Boolean isUrgent;
	private Boolean isInstant;
	private String feeType;
	private String feeAccountId;
	private TaxRelief taxRelief;
	
	
	public Creditor getCreditor() {
		return creditor;
	}

	public void setCreditor(Creditor creditor) {
		this.creditor = creditor;
	}

	public String getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(String executionDate) {
		this.executionDate = executionDate;
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

	public Number getAmount() {
		return amount;
	}

	public void setAmount(Number amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public String getFeeAccountId() {
		return feeAccountId;
	}

	public void setFeeAccountId(String feeAccountId) {
		this.feeAccountId = feeAccountId;
	}

	public TaxRelief getTaxRelief() {
		return taxRelief;
	}

	public void setTaxRelief(TaxRelief taxRelief) {
		this.taxRelief = taxRelief;
	}

	@Override
	public String toString() {
		return "MoneyTransferRequest [creditor=" + creditor + ", executionDate=" + executionDate + ", uri=" + uri
				+ ", description=" + description + ", amount=" + amount + ", currency=" + currency + ", isUrgent="
				+ isUrgent + ", isInstant=" + isInstant + ", feeType=" + feeType + ", feeAccountId=" + feeAccountId
				+ ", taxRelief=" + taxRelief + "]";
	}


	
	
}
