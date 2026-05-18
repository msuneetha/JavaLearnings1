package com.semanticsquare.oops.DependencyInjection2;

public class EngineeringCollege {
	
	public static void main(String args[]) {
		 
		 Department department = new Department("computerScience");
		 
		 College college = new College(department);//injecting the department into college constructor
		 
		 college.showDetails();
	}

}
