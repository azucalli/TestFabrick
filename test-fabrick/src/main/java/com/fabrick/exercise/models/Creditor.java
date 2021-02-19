package com.fabrick.exercise.models;
/**
 * 
 * @author azucalli
 *
 */
public class Creditor {
	
	private String name;
	private Account account;
	private Address address;			
				
		
	public Creditor() {
	}

	public Creditor(String name, Account account) {
		this.name = name;
		this.account = account;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
