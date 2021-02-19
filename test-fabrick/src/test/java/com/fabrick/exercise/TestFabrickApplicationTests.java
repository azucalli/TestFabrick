package com.fabrick.exercise;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;

import com.fabrick.exercise.dto.MoneyTransferRequest;
import com.fabrick.exercise.exceptions.FabrickClientException;
import com.fabrick.exercise.models.Account;
import com.fabrick.exercise.models.Creditor;
import com.fabrick.exercise.models.TaxRelief;
import com.fabrick.exercise.models.Transaction;
import com.fabrick.exercise.service.FabrickService;

/**
 * Integration test class
 * 
 * @author azucalli
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestFabrickApplicationTests {
	
	@Autowired
	public FabrickService fabrickService;
		

	@Test
	public void getAccountBalanceIntegrationTest() throws FabrickClientException {
		Number accountBalance=fabrickService.getAccountBalance();
		assertEquals(accountBalance.toString(),"149833.45");
	}
	
	@Test
	public void createMoneyTransferIntegrationTest() {
		Account account= new Account ("IT40L0326822311052923800661","SELBIT2BXXX");
		Creditor creditor= new Creditor("John Doe", account);		
		TaxRelief taxRelief= new TaxRelief( null, null,null, null,null);
		MoneyTransferRequest moneyTransfer= new MoneyTransferRequest();
		moneyTransfer.setDescription("Pagamento corso Java");
		moneyTransfer.setFeeType("SHA");
		moneyTransfer.setExecutionDate("2021-01-19");
		moneyTransfer.setAmount(150);
		moneyTransfer.setCurrency("EUR");
		moneyTransfer.setCreditor(creditor);
		moneyTransfer.setTaxRelief(taxRelief);
		moneyTransfer.setFeeAccountId("45685475");
		assertThrows(FabrickClientException.class,
				()->{
					fabrickService.createMoneyTransfer( moneyTransfer);
					});
	
	}
	
	@Test
	public void countTransactionsIntegrationTest() throws FabrickClientException {
		Date fromAccountingDate= new GregorianCalendar(2019, Calendar.JANUARY, 01).getTime();
		Date toAccountingDate= new GregorianCalendar(2019, Calendar.DECEMBER, 01).getTime();
		List<Transaction> accountBalance=fabrickService.getAccountTransactions( fromAccountingDate,toAccountingDate);
		assertEquals(accountBalance.size(),14);
	}
	
	@Test
	public void getFirtTransactionIntegrationTest() throws FabrickClientException {
		Date fromAccountingDate= new GregorianCalendar(2019, Calendar.JANUARY, 01).getTime();
		Date toAccountingDate= new GregorianCalendar(2019, Calendar.DECEMBER, 01).getTime();
		List<Transaction> accountBalance=fabrickService.getAccountTransactions( fromAccountingDate,toAccountingDate);
		Transaction transaction =accountBalance.stream().findFirst().get();
		assertEquals(transaction.getAmount(),-343.77);
	}
	
	
	

}
