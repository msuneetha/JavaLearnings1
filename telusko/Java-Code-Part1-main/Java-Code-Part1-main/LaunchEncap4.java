class Employee2
{
	//fields// data members// properties  //instance var
	
	private int id;//id
	
	private String name;//null
	
//	Employee2()
//	{
//		
//	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
}
public class LaunchEncap4 
{
	public static void main(String[] args)
	{
		Employee2 emp1=new Employee2();
		emp1.setId(4);
		emp1.setName("Rohit");
		
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println("********************************************");
		Employee2 emp2=new Employee2();
		emp2.setId(3);
		emp2.setName("virat");
	
		System.out.println(emp2.getId());
		System.out.println(emp2.getName());
		
		
	}

}
