package com.fabrick.exercise.models;
/**
 * @author azucalli
 *
 */
public class TaxRelief {

	private String taxReliefId;
	private Boolean isCondoUpgrade;
	private String creditorFiscalCode;
	private String beneficiaryType;
	private NaturalPersonBeneficiary naturalPersonBeneficiary;
	private LegalPersonBeneficiary legalPersonBeneficiary;
			
		
	public TaxRelief() {
		
	}

	public TaxRelief(String taxReliefId, Boolean isCondoUpgrade,
				String creditorFiscalCode, String beneficiaryType,
				NaturalPersonBeneficiary naturalPersonBeneficiary) {
		
		this.taxReliefId = taxReliefId;
		this.isCondoUpgrade = isCondoUpgrade;
		this.creditorFiscalCode = creditorFiscalCode;
		this.beneficiaryType = beneficiaryType;
		this.naturalPersonBeneficiary=naturalPersonBeneficiary;
	}

	public class LegalPersonBeneficiary{
		private String fiscalCode;
		private String legalRepresentativeFiscalCode;
	
		public String getFiscalCode() {
				return fiscalCode;
		}
		public void setFiscalCode(String fiscalCode) {
			this.fiscalCode = fiscalCode;
		}
		public String getLegalRepresentativeFiscalCode() {
			return legalRepresentativeFiscalCode;
		}
		public void setLegalRepresentativeFiscalCode(String legalRepresentativeFiscalCode) {
			this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
		}
	}
	
	public String getTaxReliefId() {
		return taxReliefId;
	}

	public void setTaxReliefId(String taxReliefId) {
		this.taxReliefId = taxReliefId;
	}

	public Boolean getIsCondoUpgrade() {
		return isCondoUpgrade;
	}

	public void setIsCondoUpgrade(Boolean isCondoUpgrade) {
		this.isCondoUpgrade = isCondoUpgrade;
	}

	public String getCreditorFiscalCode() {
		return creditorFiscalCode;
	}

	public void setCreditorFiscalCode(String creditorFiscalCode) {
		this.creditorFiscalCode = creditorFiscalCode;
	}

	public String getBeneficiaryType() {
		return beneficiaryType;
	}

	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}

	public NaturalPersonBeneficiary getNaturalPersonBeneficiary() {
		return naturalPersonBeneficiary;
	}

	public void setNaturalPersonBeneficiary(NaturalPersonBeneficiary naturalPersonBeneficiary) {
		this.naturalPersonBeneficiary = naturalPersonBeneficiary;
	}

	public LegalPersonBeneficiary getLegalPersonBeneficiary() {
		return legalPersonBeneficiary;
	}

	public void setLegalPersonBeneficiary(LegalPersonBeneficiary legalPersonBeneficiary) {
		this.legalPersonBeneficiary = legalPersonBeneficiary;
	}
}
