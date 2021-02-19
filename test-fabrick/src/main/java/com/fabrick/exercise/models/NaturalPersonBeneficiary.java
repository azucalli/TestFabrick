package com.fabrick.exercise.models;
/**
 * 
 * @author azucalli
 *
 */
public class NaturalPersonBeneficiary {

	private String fiscalCode1;	
	
	public NaturalPersonBeneficiary() {
		
	}
	
	public NaturalPersonBeneficiary(String fiscalCode1) {
		this.fiscalCode1 = fiscalCode1;
	}

	public String getFiscalCode() {
		return fiscalCode1;
	}

	public void setFiscalCode(String fiscalCode1) {
		this.fiscalCode1 = fiscalCode1;
	}	
}
