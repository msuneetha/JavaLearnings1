package src.com.semanticsquare.basics.oops.p2;

import src.com.semanticsquare.basics.oops.p1.A1;

public class A2 extends A1 { // here we are extending the class from different package, so need to have import statement

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("public var " + publicVar);// we can access directly as its extending the super class
		//System.out.println("private var " + privateVar);//cannot access private variables as access is limited to that class
		System.out.println("protected var " + protectVar);// we can access protected variables/methods as this class is extending A1 
		//System.out.println("default var " + defaultVar);// default variables/methods are not accessible outside of the package
		
		//A1 a1 = new A1();
		protectVar = 123;
	}

}
