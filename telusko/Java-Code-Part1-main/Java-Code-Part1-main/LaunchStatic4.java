import java.util.Scanner;

class Farmer
{
	private float amount;
	private float si;
	private float tenure;
	
	private static float roi;
	
	static
	{
		roi=4.5f;
	}
	
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter loan amount required");
		amount=scan.nextFloat();
		
		System.out.println("Kindly enter time needed");
		tenure=scan.nextFloat();
	}
	void compute()
	{
		si = (amount * roi * tenure)/100.0f;
	}
	void display()
	{
		System.out.println("SI is "+ si);
	}
	static void show()
	{
		System.out.println("Loan app loged out");
	}
	
}
public class LaunchStatic4 
{
	public static void main(String[] args)
	{
		System.out.println("Farmer Loan Application");
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		Farmer f3=new Farmer();
		
		System.out.println("Farmer 1 kindly fill form");
		f1.input();
		f1.compute();
		f1.display();
		
		System.out.println("Farmer 2 kindly fill form");
		f2.input();
		f2.compute();
		f2.display();
		
		System.out.println("Farmer 3 kindly fill form");
		f3.input();
		f3.compute();
		f3.display();

		Farmer.show();
		//f1.show();
		

		
		
	}

}
