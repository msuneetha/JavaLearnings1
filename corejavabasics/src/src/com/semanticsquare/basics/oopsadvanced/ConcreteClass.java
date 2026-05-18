package src.com.semanticsquare.basics.oopsadvanced;

public class ConcreteClass extends SubAbstract{
	
	public int bar() {
		int val2 = 25;
		System.out.println("i m in concrete class bar" + val2);
		return val2;
	}
	
	public ConcreteClass(int id) {		
		super(id);		
	}
	
//	public int compute(int response, int temp1) {
//		int res = response + temp1;
//		System.out.println(" i m in concrete class " + res );
//		
//		return res;
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubAbstract sa = new ConcreteClass(20);
		int response = sa.compute();
		System.out.println("result of addition in concrete class"+ response);
		
		sa.compute(response, 15);
		
	}

}
