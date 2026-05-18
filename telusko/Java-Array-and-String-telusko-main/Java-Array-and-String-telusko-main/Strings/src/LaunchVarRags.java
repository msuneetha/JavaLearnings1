class Calc
{
	public int add( int ... a )// int a[]={4,4,54,54};
	{
		int sum=0;
		for(int data:a)
		{
			sum = sum+ data;
		}
		return sum;
		
	}
}
public class LaunchVarRags 
{

	public static void main(String[] args)
	{
		Calc c=new Calc();
		System.out.println(c.add(4,5,54,45));
		
	}
}
	
