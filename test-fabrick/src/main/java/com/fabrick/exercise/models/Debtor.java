package com.fabrick.exercise.models;
/**
 * 
 * @author azucalli
 *
 */
public class Debtor{
	

	private Address address;
	private Account account;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}