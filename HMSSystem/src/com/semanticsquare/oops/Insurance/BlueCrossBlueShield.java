package com.semanticsquare.oops.Insurance;

public class BlueCrossBlueShield implements InsuranceBrand{
	
	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public double computeMonthlyPremium(HealthInsurancePlan plan, int age, boolean smoking) {
		double totalPremium = 0;
		//640  +150
		System.out.println("the plan being returned "+ plan.toString());
		if (plan instanceof PlatinumPlan ) {
			if (age > 55) {			
				totalPremium += 200;
			}
			if(smoking) {
				totalPremium += 100;
			}
		}
		if (plan instanceof GoldPlan) {
			
			if (age > 55) {			
				totalPremium += 150;
			}
			if(smoking) {
				totalPremium += 90;
			}
			
		}
		if (plan instanceof SilverPlan) {
			
			if (age > 55) {			
				totalPremium += 100;
			}
			if(smoking) {
				totalPremium += 80;
			}
			
		}
		if (plan instanceof BronzePlan) {
			
			if (age > 55) {			
				totalPremium += 50;
			}
			if(smoking) {
				totalPremium += 70;
			}
			
		}
		return totalPremium;
	}

}
