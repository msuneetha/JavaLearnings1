class Telusko
{
	int id;
	String cN;
	public void disp()
	{
		System.out.println("visit telusko.com");
	}	
}
public class LaunchArray3 
{
	public static void main(String[] args)
	{
		Telusko []t=new Telusko[3];
		
		t[0]=new Telusko();
		t[1]=new Telusko();
		t[2]=new Telusko();
//		t[3]=new Telusko();
		
		t[0].disp();
		t[0].id=4;
		t[0].cN="AI Engineering";
		
		
		
	}

}
