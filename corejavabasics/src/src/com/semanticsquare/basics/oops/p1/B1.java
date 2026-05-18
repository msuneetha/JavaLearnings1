package src.com.semanticsquare.basics.oops.p1;

public class B1 extends A1{ 
	//extends is the keyword used to get inheritance .Here A1 is super class and B1 is child and B1 can access all variables and Methods as long as they are public /protected access modifiers.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//also as this class B1 is  extending A1 we need not have any special way to access A1 members. we can directly invoke the members.
			System.out.println("This is to access super class variables "+ publicVar); // can access publicVar directly
			System.out.println("Protected Var can i access?" + protectVar); //protected var can be accessed to all its children
			//System.out.println("private var can i access?" + privateVar);
			//cannot access the private variables in the sub classes as they are just limited to the class where declared
			System.out.println(" default access " + defaultVar);
			//default will be accessible as long as in the same package
	}

}
