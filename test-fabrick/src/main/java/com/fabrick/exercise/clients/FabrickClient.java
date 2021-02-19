package com.fabrick.exercise.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

import com.fabrick.exercise.config.FabrickRestClientConfig;
import com.fabrick.exercise.dto.BalanceAccountResponse;
import com.fabrick.exercise.dto.MoneyTransferRequest;
import com.fabrick.exercise.dto.MoneyTransferResponse;
import com.fabrick.exercise.dto.TransactionsResponse;
import com.fabrick.exercise.exceptions.FabrickClientException;
import com.fabrick.exercise.models.Transaction;
import com.fabrick.exercise.dto.BalanceAccountResponse.Payload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Component
public class FabrickClient {
	

	@Autowired
	private FabrickRestClientConfig fabrickRestClientConfig;
	
	/**
	 * Gets account balance informations
	 * 
	 * @param accountId, account number
	 * @return 
	 * @throws FabrickClientException 
	 */
	public Payload getBalance(Long accountId) throws FabrickClientException {
		
		HttpEntity<String> requestEntity = new HttpEntity<>("", fabrickRestClientConfig.getHeaders());		
		try {
			ResponseEntity<BalanceAccountResponse> responseEntity = fabrickRestClientConfig.getRestTemplate()
				.exchange(fabrickRestClientConfig.getBaseUrl() + accountId+"/balance", 
						HttpMethod.GET, 
						requestEntity, 
						BalanceAccountResponse.class);
		
			return responseEntity.getBody().getPayload();
		}catch(HttpClientErrorException e){
			System.out.println("GetBalance threw the following error:"+e.getMessage());
			throw new FabrickClientException("GetBalance threw the following error:"+e.getMessage(), e);
		}
	}
	
	
	/**
	 * Creates a money transfer 
	 * 
	 * @param accountId, account number
	 * @return 
	 * @throws JsonProcessingException 
	 * @throws FabrickClientException 
	 */
	public MoneyTransferResponse postMoneyTransfer(Long accountId, MoneyTransferRequest moneyTransferRequest) throws JsonProcessingException, FabrickClientException {
		ObjectMapper mapper = new ObjectMapper();
		try {
			HttpEntity<String> requestEntity = new HttpEntity<>(mapper.writeValueAsString(moneyTransferRequest), fabrickRestClientConfig.getHeaders());
			ResponseEntity<MoneyTransferResponse> responseEntity = fabrickRestClientConfig.getRestTemplate()
					.exchange(fabrickRestClientConfig.getBaseUrl() +accountId+"/payments/money-transfers", 
							HttpMethod.POST, 
							requestEntity, 
							MoneyTransferResponse.class);		
			return responseEntity.getBody();
		}catch(HttpClientErrorException e){
			System.out.println("postMoneyTransfer threw the following error:"+e.getMessage());
			throw new FabrickClientException("PostMoneyTransfer threw the following error:"+e.getMessage(), e);
		}
	}
	
	
	/**
	 * Gets the list of transactions executed between the dates fromAccountingDate and toAccountingDate
	 * 
	 * @param accountId, account number
	 * @param fromAccountingDate, start date
	 * @param toAccountingDate, end date
	 * @return 
	 * @throws FabrickClientException 
	 */
	public List<Transaction> getTransactions(Long accountId, String fromAccountingDate, String toAccountingDate) throws FabrickClientException {		
		HttpEntity<String> requestEntity = new HttpEntity<>("", fabrickRestClientConfig.getHeaders());	
		try {
			ResponseEntity<TransactionsResponse> responseEntity = fabrickRestClientConfig.getRestTemplate()
				.exchange(fabrickRestClientConfig.getBaseUrl() + accountId+"/transactions?fromAccountingDate="+ fromAccountingDate+"&toAccountingDate="+toAccountingDate, 
						HttpMethod.GET, 
						requestEntity, 
						TransactionsResponse.class);
			return responseEntity.getBody().getPayload().getList();
		}catch(HttpClientErrorException e){
			System.out.println("GetTransactions threw the following error:"+e.getMessage());
			throw new FabrickClientException("GetTransactions threw the following error:"+e.getMessage(), e);
		}
	}

}
