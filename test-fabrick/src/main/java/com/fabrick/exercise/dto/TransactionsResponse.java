package com.fabrick.exercise.dto;


import java.util.List;

import com.fabrick.exercise.models.Transaction;


public class TransactionsResponse extends ResponseModel{

	
	public Payload payload;
	
	
	public class Payload {
	private	List<Transaction> list;
	
		
		
		public List<Transaction> getList(){
			return this.list;
		}
		
		public void setList(List<Transaction> list) {
			this.list = list;
		}
		
	}

	public Payload getPayload() {
		return payload;
	}


	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	
	
}
