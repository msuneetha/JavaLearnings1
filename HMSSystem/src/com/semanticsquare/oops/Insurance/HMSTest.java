package com.semanticsquare.oops.Insurance;

import com.semanticsquare.oops.HMS.User;
import com.semanticsquare.oops.HMS.Staff;
import com.semanticsquare.oops.HMS.Patient;
import com.semanticsquare.oops.HMS.Nurse;
import com.semanticsquare.oops.HMS.Doctor;

public class HMSTest {
	
	double monthlyInstallment;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HealthInsurancePlan insurancePlan = new PlatinumPlan(); // abstract class
		InsuranceBrand insuranceBrand = new BlueCrossBlueShield(); // Interface 
		insurancePlan.setOfferedBy(insuranceBrand);
		User staff = new Staff();
		staff.setInsurancePlan(insurancePlan);
		        
		double[] payments = Billing.computePaymentAmount(staff, 1000.0);
		
		double monthlyInstallment = insurancePlan.computeMonthlyPremium(8000, 56, true);
		
		System.out.println(" insurance company amount" +  payments[0]);
		System.out.println(" Patient amount amount" + payments[1]);
		System.out.println("Monthly pemium for Platinum with Salary $8000: $" + monthlyInstallment);

		
		insurancePlan = new GoldPlan(); 
		insuranceBrand = new BlueCrossBlueShield();
		insurancePlan.setOfferedBy(insuranceBrand);
		staff = new Nurse();
		staff.setInsurancePlan(insurancePlan);
		        
		payments = Billing.computePaymentAmount(staff, 1000.0);
		 monthlyInstallment = insurancePlan.computeMonthlyPremium(8000, 65, true);
		
		System.out.println(" insurance company amount" +  payments[0]);
		System.out.println(" Patient amount amount" + payments[1]);
		System.out.println("Monthly pemium for Gold with Salary $5000: " + monthlyInstallment);
		
		insurancePlan = new SilverPlan();
		insuranceBrand = new BlueCrossBlueShield();
		insurancePlan.setOfferedBy(insuranceBrand);
		staff = new Patient();
		staff.setInsurancePlan(insurancePlan);
		        
		payments = Billing.computePaymentAmount(staff, 1000.0);
		monthlyInstallment = insurancePlan.computeMonthlyPremium(5000, 45, false);
		
		System.out.println(" insurance company amount" +  payments[0]);
		System.out.println(" Patient amount amount" + payments[1]);
		System.out.println("Monthly pemium for Silver with Salary $5000: " + monthlyInstallment);

		
		insurancePlan = new BronzePlan();
		insuranceBrand = new BlueCrossBlueShield();
		insurancePlan.setOfferedBy(insuranceBrand);
		staff = new Doctor();
		staff.setInsurancePlan(insurancePlan);
		        
		payments = Billing.computePaymentAmount(staff, 1000.0);
		monthlyInstallment = insurancePlan.computeMonthlyPremium(8000, 45, true);
		
		System.out.println(" insurance company amount" +  payments[0]);
		System.out.println(" Patient amount amount" + payments[1]);
		System.out.println("Monthly pemium for Bronze with Salary $5000: " + monthlyInstallment);
		
		//insurancePlan = new BronzePlan();        
//		patient = new Patient();
//		patient.setInsurancePlan(null);
//		        
//		payments = Billing.computePaymentAmount(patient, 1000.0);
//		monthlyInstallment = insurancePlan.calculateMonthlyPremium(5000);
//		
//		System.out.println(" insurance company amount" +  payments[0]);
//		System.out.println(" Patient amount amount" + payments[1]);
//		System.out.println("Monthly pemium for no insurance with Salary $5000: " + monthlyInstallment);

	}

}
