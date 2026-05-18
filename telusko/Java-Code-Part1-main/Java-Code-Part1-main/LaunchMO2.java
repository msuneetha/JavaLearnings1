class Calc3
{
//	double add(double a, double b)
//	{
//		return a+b;
//	}
	
	int add(int a, int b)
	{
		return a+b;
	}
	
	double add(int a, double b)
	{
		return a+b;
	}
	
	double add(double a, int b)
	{
		return a+b;
	}
	
}
public class LaunchMO2
{

	public static void main(String[] args) 
	{
		Calc3 c=new Calc3();
		
		//The method add(int, double) is ambiguous for the type Calc3
		System.out.println(c.add(4, 4664554l));

		main(45);
		main("Telusko", 54);
	}
	
	public static void main(int args) 
	{
		System.out.println("main with int args");

	}
	
	public static void main(String a,int args) 
	{
		System.out.println("main with int args amd string args");

	}
	
	public static void main(String args[], int b) 
	{
		System.out.println("main with int args");

	}

}
