
public class LaunchStatic3
{
	static int a;
	
	static 
	{
		a=10;
		System.out.println("static block");
	}

	public static void main(String[] args) 
	{
		System.out.println("static method");
		System.out.println("a "+ a);
	
	}
	
	//control flow --> memory
	

}
