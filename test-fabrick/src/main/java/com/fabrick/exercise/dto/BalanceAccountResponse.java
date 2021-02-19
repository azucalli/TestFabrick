package com.fabrick.exercise.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BalanceAccountResponse extends ResponseModel {	
	
	private Payload payload;
	
		
	public class Payload{
	
		public Date date;
    	public Number balance;
    	public Number availableBalance;
    	public String currency;
    
        
    
		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public Number getBalance() {
			return balance;
		}
		public void setBalance(Number balance) {
			this.balance = balance;
		}
		public Number getAvailableBalance() {
			return availableBalance;
		}
		public void setAvailableBalance(Number availableBalance) {
			this.availableBalance = availableBalance;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
	}

	
	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}	

}
