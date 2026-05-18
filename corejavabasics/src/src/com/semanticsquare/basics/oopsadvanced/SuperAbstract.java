package src.com.semanticsquare.basics.oopsadvanced;

public abstract class SuperAbstract {
	
	public int id;
	public int response;
	
	//public abstract String printClass();
	public abstract int foo();
	public abstract int bar();
	
	public SuperAbstract(int id) {
		this.id = id;
	}
	
	
	public int compute() {
		
		response = foo() + bar();
		System.out.println("i am in compute " + id);
		return response;
	}
	
	//public abstract int compute(int response, int temp1);
	
	protected int compute(int response, int temp1) {
		int res = response + temp1;
		System.out.println(" i m in superAbstract class " + res );		
		return res;
		
	}
	

}
