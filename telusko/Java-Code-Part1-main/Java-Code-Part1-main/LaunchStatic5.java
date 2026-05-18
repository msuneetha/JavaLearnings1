class TeluskoAI
{
	static int age;
	
	static
	{
		age=11;
		System.out.println("static block of telusko");
	}
	
	static void disp()
	{
		System.out.println("age is "+ age);
	}
}
public class LaunchStatic5
{
	public static void main(String[] args)
	{
		TeluskoAI.disp();
	}

}
//Inheritance
//Polymorphism
//abstract
//final
//interface
//loosecoupline
//dependency injection
//why spring
//lambda


