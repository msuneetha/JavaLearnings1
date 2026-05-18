class TeluskoAI
{
	private int id;
	private String course;
	public void courses()
	{
		id=4;
		course="SpringBoot";
		System.out.println("visit telusko.com");
	}
	
	public String toString() {
		return "I m in pune right now";
	}
	
	
}

public class LaunchToString 
{
	public static void main(String[] args) 
	{
		TeluskoAI ai=new TeluskoAI();
		ai.courses();
		System.out.println(ai);
	}

}
