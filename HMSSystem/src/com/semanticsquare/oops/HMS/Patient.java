package com.semanticsquare.oops.HMS;

//import com.semanticsquare.oops.Insurance;
//import com.semanticsquare.oops.Insurance.InsuranceBrand;

public class Patient extends User{
	
	  private long patientId;
	  
	  //private InsuranceBrand insuranceBrand = new InsuranceBrand();
	
	  
	  
	  public long getPatientId() {
	      return patientId;
	  }
	  
	  public void setPatientId(long patientId) {
	      this.patientId = patientId;
	  }
}
