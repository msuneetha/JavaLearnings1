class Alien2
{
	static int a, b;
	
	int x, y;
	
	static
	{
		System.out.println("Static block");
		a=10;
		b=20;
//		x=5;
//		y=5;
		System.out.println("a :"+ a);
		System.out.println("b :"+ b);

	}
	
	{
		System.out.println("Java init block");
	}
	
	Alien2(int x, int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("x :"+ x);
		System.out.println("y :"+ y);
	}
}
public class LaunchStatic2
{
	public static void main(String[] args)
	{
		Alien2 al=new Alien2(4,5);
		System.out.println("***************************");
		Alien2 al2=new Alien2(8,10);
	}

}
