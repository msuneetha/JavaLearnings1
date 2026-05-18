package src.com.semanticsquare.basics.oopsadvanced;

public abstract class SubAbstract extends SuperAbstract {
	
	public int id;
	
	public SubAbstract(int id) {
		super(id);
		this.id = id;
	
	}
	
	
	
	public int foo() {
		int val1 = 10;
		System.out.println("I m in sub abstract in foo " + val1);
		return val1;
	}

}
