import java.util.Scanner;

public class LaunchArray1
{
	public static void main(String[] args)
	{
		// create an array to store 5 students marks;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size");
		int size=scan.nextInt();
		int []marks=new int[size];
		
		int size1=marks.length;
		
//		marks[0]=4;
//		marks[1]=5;
//		marks[2]=6;
//		marks[3]=3;
		
//		Scanner scan=new Scanner(System.in);
		System.out.println("Marks collection app");
		
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Kindly enter marks of student "+ i);
			marks[i] = scan.nextInt();
		}
		System.out.println("Marks are stored as follows");
		
		for(int i=0;i<5;i++)
		{
			System.out.print(marks[i]+ " ");

		}
		System.out.println();
		
		
		
		
	}

}
