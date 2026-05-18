package com.semanticsquare.oops.Insurance;

import com.semanticsquare.oops.HMS.User;

public class Billing {
	
	public static double[] computePaymentAmount(User user, double amount) {
        double[] payments = new double[2];
        
        double insCov;
        
        HealthInsurancePlan patientInsurancePlan = user.getInsurancePlan();
        
             if(patientInsurancePlan instanceof PlatinumPlan) {
            	 
            	 insCov = amount * patientInsurancePlan.getCoverage();
            	 payments[0] = insCov;
            	 payments[1] = amount - insCov - 50.0;
            	 
             }else if (patientInsurancePlan instanceof GoldPlan) {
            	 
            	 insCov = amount * patientInsurancePlan.getCoverage();
            	 payments[0] = insCov;
            	 payments[1] = amount - insCov - 40.0;         	 
            	 
             }else if (patientInsurancePlan instanceof SilverPlan) {
            	 
            	 insCov = amount * patientInsurancePlan.getCoverage();
            	 payments[0] = insCov;
            	 payments[1] = amount - insCov - 30.0;           	     
            	 
             }else if (patientInsurancePlan instanceof BronzePlan) {
            	 
            	 insCov = amount * patientInsurancePlan.getCoverage();
            	 payments[0] = insCov;
            	 payments[1] = amount - insCov - 25;           	              	 
            	 
             }else {
            	 payments[0] = 0.0;
            	 payments[1] = amount - 20.0;
            	 
             }

        // your logic        

        return payments;
    }


}
