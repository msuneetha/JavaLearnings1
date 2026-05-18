package com.semanticsquare.oops.Insurance;

public class PlatinumPlan extends HealthInsurancePlan {
	
	//private double totalPremium;
	
	public PlatinumPlan() {
		setCoverage(0.9);
		setPremiumPercentage(0.08);
	}
	
	
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		
		return (salary * getPremiumPercentage()) + getOfferedBy().computeMonthlyPremium(this, age, smoking);
		
	}
}
