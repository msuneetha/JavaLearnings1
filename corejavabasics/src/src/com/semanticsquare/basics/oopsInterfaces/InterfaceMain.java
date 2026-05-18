package src.com.semanticsquare.basics.oopsInterfaces;

public interface InterfaceMain {
	
	public int foo();
	
	public default void defaultMethod() {
		System.out.println("i m in interface main");
	}

}
