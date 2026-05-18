package src.com.semanticsquare.basics.oops.p2;

import src.com.semanticsquare.basics.oops.p1.A1;

public class B2 {
    // Here B2 is not  extending A1 class and lets see if we can access any methods/variables.
	//We need to import A1 as we are in different package 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("public var" + A1.publicVar);
		//System.out.println("private var" + A1.privateVar); //Cannot access private variables/methods as they are limited to the class they are declared
		//System.out.println("protected var" + A1.protectVar); //Cannot access protected Var as this class is not extending A1 
		//System.out.println("default var" + A1.defaultVar); // cannot access default var as its limited to the package

	}

}
