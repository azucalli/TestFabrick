package com.fabrick.exercise.service;


import java.util.Date;
import java.util.List;

import com.fabrick.exercise.dto.MoneyTransferRequest;
import com.fabrick.exercise.dto.MoneyTransferResponse;
import com.fabrick.exercise.exceptions.FabrickClientException;
import com.fabrick.exercise.models.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
/**
 * 
 * @author azucalli
 *
 */
public interface FabrickServiceInterface {
	
	/**
	 * Gets account balance 
	 * @return
	 * @throws FabrickClientException
	 */
	public Number getAccountBalance() throws FabrickClientException;
	
	/**
	 * Create money transfer 
	 * @param MoneyTransferRequest, mandatory field Customer.name, Description,Currency,Amount and ExecutionDate 
	 * @return
	 * @throws FabrickClientException
	 */
	public MoneyTransferResponse createMoneyTransfer( MoneyTransferRequest moneyTransfer) throws JsonProcessingException, FabrickClientException;
	
	/**
	 * Create money transfer 
	 * @param fromAccountingDate 
	 * @param toAccountingDate 
	 * @return
	 * @throws FabrickClientException
	 */
	public List<Transaction> getAccountTransactions( Date fromAccountingDate, Date toAccountingDate) throws FabrickClientException;

}
