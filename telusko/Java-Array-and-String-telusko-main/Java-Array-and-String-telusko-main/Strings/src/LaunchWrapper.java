
public class LaunchWrapper 
{
	public static void main(String[] args)
	{
//		int --> Integer
//		char --> Character
//		double --> Double
//		boolean --> Boolean
//		...
		//Integer i=new Integer(10);
		Integer i2=Integer.valueOf(4);//Boxing int --> Integer
		// Boxing --> AutoBoxing
		int age=16;//primitive
		Integer a=age;//primitive --> Integer Object --> AutoBoxing
		
		//UnBoxing --> AutoBoxing
		int d=i2.intValue();//UnBoxing
		int data=i2;//AutoUnBoxing
		
	}

}
