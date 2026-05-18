package com.semanticsquare.oops.Insurance;

public class SilverPlan extends HealthInsurancePlan {
	
	public SilverPlan() {
		setCoverage(0.7);
		setPremiumPercentage(0.06);
	}
	
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return (salary * getPremiumPercentage()) + getOfferedBy().computeMonthlyPremium(this, age, smoking);
		
	}

}
