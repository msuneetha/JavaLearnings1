package src.com.semanticsquare.basics.oops.p1;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here we are not extending A1 we need to use class.variable/method to access the members or if they are instance content, we need to create object and refer using the object.
		//System.out.println("private var" + A1.privateVar);
		System.out.println("public var" + A1.publicVar); //public can be accessed any where 
		System.out.println("protected var" + A1.protectVar); // protected can be used as long as in the package
		System.out.println("default var" + A1.defaultVar); // default can be used as long as in the package

	}

}
