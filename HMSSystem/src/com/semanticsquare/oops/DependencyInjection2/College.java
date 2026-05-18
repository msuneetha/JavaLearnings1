package com.semanticsquare.oops.DependencyInjection2;

public class College {
	
	private final Department department;
	
	public College(Department department) {
		this.department = department;
		
	}
	
	
public void showDetails() {
	System.out.println("department is " +  department.getDetails());
	
}
	
	

}
