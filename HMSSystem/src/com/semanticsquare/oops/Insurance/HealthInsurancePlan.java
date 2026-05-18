package com.semanticsquare.oops.Insurance;

public abstract class HealthInsurancePlan {
    // Code for 'coverage' field goes here
	
	private double coverage;
	
	private double premiumPercentage;
    
    // Don't worry about the below code and also the InsuranceBrand class
	private InsuranceBrand offeredBy;

	public InsuranceBrand getOfferedBy() {
		return offeredBy;
	}

	public void setOfferedBy(InsuranceBrand offeredBy) {
		this.offeredBy = offeredBy;
	}
	
	public double getCoverage() {
		return coverage; 
	}
	
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	
	public double getPremiumPercentage() {
		return premiumPercentage;
	}
	
	public void setPremiumPercentage(double premiumPercentage) {
		this.premiumPercentage = premiumPercentage;
	}
	
	public abstract double computeMonthlyPremium(double salary, int age, boolean smoking);
	
	//public double computeMonthlyPremium(HealthInsurancePlan plan, int age, boolean smoking) {
		
	//}
	//}
}
