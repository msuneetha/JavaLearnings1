package src.com.semanticsquare.basics.oopsInterfaces;

public interface InterfaceChild extends InterfaceMain {
	
	public int bar();
	public int foo();
	
	public default void defaultMethod() {
		System.out.println("i m in interface child");
	}

}
