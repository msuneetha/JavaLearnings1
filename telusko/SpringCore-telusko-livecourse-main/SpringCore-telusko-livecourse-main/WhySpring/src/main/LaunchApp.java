package main;

import services.AIEngineering;
import services.DevOps;
import services.SystemDesign;

//class Alpha
//{
//	public void disp()
//	{
//		System.out.println("Alpha");
//	}
//}
//class Beta //extends Alpha
//{
//	public void beta()
//	{
////		Alpha a=new Alpha();//composition
////		a.disp();
////		disp();
//	}
//}
public class LaunchApp 
{
	public static void main(String[] args) 
	{
		DevOps dev=new DevOps(); //dependent
		AIEngineering ai=new AIEngineering();//dependent
		SystemDesign sd=new SystemDesign();//dependent
		
		Telusko t=new Telusko(dev);//target
		
		//DI --> Injecting Dependent object into target object
		//setter injection
		t.setCourse(ai);
		
		int age=15;
		age=16;
		
		Boolean status=t.buyTheCouuse(5999.8);
		if(status)
			System.out.println("Successful");
		else
			System.out.println("Failed to enroll");
		
	}
	
	// Inheritance, Interface ===> Polymorphism

}












