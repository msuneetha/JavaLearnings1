class Demo
{
	static int a ,b; //1 static var
	
	int x ,y;  //instance var

	static  // 2
	{
		a=10;
		b=20;
		//x=10;
		System.out.println("Static init block");
	}
	
	{
		System.out.println("Java init block(non static)");
	}
	
	Demo()
	{
		System.out.println("Constructor");
	}
	static void disp()
	{
		System.out.println("disp static method");
	}
	
	void show()
	{
		System.out.println("non static show method");
	}
}
public class LaunchStatic
{
	
	static  //1 
	{ 
		System.out.println("static block main");
	}
	
	public static void main(String[] args) // 2 
	{
		System.out.println("main method");
		
//		Demo d= new Demo();
		
		//new Demo(); // --> Instance memory --> Constructor --> java init block
	}
}
