class Employee
{
	private int age;   //instance variables, fields, data members
	
	
	//setter
	void setAge(int x)
	{
		age=x;
	}

	//getter
	int getAge()
	{
		return age;
	}
	
	
}
public class LaunchEncap
{
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setAge(45);
//		e.age=-18;
//		e.name="zjhcb kjshdb JKHDb kjzhsd ckjshd ";
//		
//		System.out.println(e.age);
//		System.out.println(e.name);
		
		
		e.getAge();
	}

}
