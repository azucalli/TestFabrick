package com.fabrick.exercise.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 *  @author azucalli
 *
 */
public class Transaction {
	
	private String transactionId;
	private String operationId;
	private Date accountingDate;
	private Date valueDate;
	public Type type;
	private Number amount;
	private String currency;
	private String description;

	public class Type{
		private String enumeration;
		private String value;
		public String getEnumeration() {
			return enumeration;
		}
		public void setEnumeration(String enumeration) {
			this.enumeration = enumeration;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
	}
	public String getTransactionId() {
	return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getOperationId() {
		return operationId;
	}
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	public Date getAccountingDate() {
	return accountingDate;
	}
	public void setAccountingDate(Date accountingDate) {
		this.accountingDate = accountingDate;
	}
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	public Date getValueDate() {
		return valueDate;
	}
	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	    


}
