package com.fabrick.exercise.models;
/**
 * 
 * @author azucalli
 *
 */
public class Amount{
	private Number debtorAmount;
	private String depbtorCurrency;
	private Number creditorAmount;
	private String creditorCurrency;
	private Number exchangeRate;
	
	public Number getDebtorAmount() {
		return debtorAmount;
	}
	public void setDebtorAmount(Number debtorAmount) {
		this.debtorAmount = debtorAmount;
	}
	public String getDepbtorCurrency() {
		return depbtorCurrency;
	}
	public void setDepbtorCurrency(String depbtorCurrency) {
		this.depbtorCurrency = depbtorCurrency;
	}
	public Number getCreditorAmount() {
		return creditorAmount;
	}
	public void setCreditorAmount(Number creditorAmount) {
		this.creditorAmount = creditorAmount;
	}
	public String getCreditorCurrency() {
		return creditorCurrency;
	}
	public void setCreditorCurrency(String creditorCurrency) {
		this.creditorCurrency = creditorCurrency;
	}
	public Number getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(Number exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	
}