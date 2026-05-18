//dev1
class Calc1
{
	
	int add(int n1, int n2)
	{
		int res=n1+n2;
		return res;
	}
	
//	void add(int n1, int n2)
//	{
//		int res=n1+n2;
//		
//	}
     //4.5+4 ==> 8.5
	
	float add(float n1, int n2)
	{
		float res=n1+n2;
		return res;
	}
	
	float add(int n1, float n2)
	{
		float res=n1+n2;
		return res;
	}
	
	float add(float n1, float n2)
	{
		float res=n1+n2;
		return res;
	}
	
	float add(float n1, float n2, int n3)
	{
		float res=n1+n2+n3;
		return res;
	}
	
	int add(int n1, int n2, int n3)
	{
		int res=n1+n2+n3;
		return res;
	}
	
	double add(double n1, double n2, double n3)
	{
		double res=n1+n2+n3;
		return res;
	}
}

//dev2
public class LanchMO
{
	public static void main(String[] args) 
	{
		Calc1 c=new Calc1();
		
		// 1:M --> polymophism  --> false --> compile time polymorphism
		System.out.println(c.add(4, 5));// name, number of parameters , data type of parameter
		                               // order of data type of parameter
		System.out.println(c.add(4.5f, 5));
		System.out.println(c.add(4, 4,4));
		System.out.println(c.add(4.5,4.5, 4.5));
	}

}
