
public class LaunchArray4 
{

	public static void main(String[] args)
	{
//		int ar[] = {4,5,6,7};
//		int arr[][] = {{2,4},{2,4}};
//		int arr2[][] = {{2,4,5},{2,4}};
//		
//		for each loop
//		==============
		
		int data[]= {4,5,6,8,3};
//		for(int i=2; i<data.length; i++)
////		{
////			System.out.println(data[i]);
////		}
////		
		//enhanced loop or for each
		for(int a:data)
		{
			System.out.println(a);
		}
		
		int arr[][]= {{5,6},{5,4}};
		
		for(int row[]:arr)
		{
			for(int a:row)
			{
				System.out.print(a);
			}
			System.out.println();
		}
		
	}

}
