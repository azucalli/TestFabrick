package com.fabrick.exercise.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fabrick.exercise.clients.FabrickClient;
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
@Service
public class FabrickService implements FabrickServiceInterface {
	
	@Autowired
	public FabrickClient fabrickClient;
	
	@Value("${accountId}")
	private Long accountId;
	

	public Number getAccountBalance() throws FabrickClientException {
		return fabrickClient.getBalance(accountId).getBalance();
	}
	

	public MoneyTransferResponse createMoneyTransfer( MoneyTransferRequest moneyTransfer) throws JsonProcessingException, FabrickClientException {
		return fabrickClient.postMoneyTransfer(accountId, moneyTransfer);
	}
	

	public List<Transaction> getAccountTransactions( Date fromAccountingDate, Date toAccountingDate) throws FabrickClientException{
		return fabrickClient.getTransactions(accountId, fromDateToString(fromAccountingDate), fromDateToString(toAccountingDate));
	}
	

	public String fromDateToString(Date date) {
		String pattern = "yyyy-MM-dd";
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}

	
}
