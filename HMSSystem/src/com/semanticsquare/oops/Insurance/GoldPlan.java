package com.semanticsquare.oops.Insurance;

public class GoldPlan extends HealthInsurancePlan {
	
	public GoldPlan() {
		setCoverage(0.8);
		setPremiumPercentage(0.07);
	}
	
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return (salary * getPremiumPercentage()) + getOfferedBy().computeMonthlyPremium(this, age, smoking);
		
	}

}
