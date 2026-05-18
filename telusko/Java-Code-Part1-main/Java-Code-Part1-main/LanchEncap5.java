class Student2
{
	private int age;
	private String name;
	
//	Student2()
//	{
//		
//	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
public class LanchEncap5
{
	public static void main(String[] args)
	{
		Student2 st1=new Student2();
		Student2 st2=new Student2();

		st1.setAge(18);
		st1.setName("Rohan");
		
		st2.setAge(16);
		st2.setName("Mehtab");

		
	}

}
