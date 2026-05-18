class Alien
{
	private int id;
	private String name;
	
	
	//shadowing prob
	//this keyword
	void setId(int x)
	{
		id=x;
	}
	
	void setName(String x)
	{
		name=x;
	}
	
	int getId()
	{
		return id;
	}
	
	String getName()
	{
		
		return name;
	}
	
}
public class LaunchEncap3 
{
	public static void main(String[] args)
	{
		Alien a=new Alien();
		a.setId(2);
		a.setName("Rohan");
		
		System.out.println(a.getId());
		System.out.println(a.getName());
	}

}
