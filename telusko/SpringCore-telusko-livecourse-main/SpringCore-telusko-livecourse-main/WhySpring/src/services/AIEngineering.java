package services;

public class AIEngineering implements ICourse
{

	@Override
	public boolean registerTheCourse(double amount)
	{
		System.out.println("Registered in AI ENGINEERING course of Telusko and fees paid is "+amount);
		return true;
	}
}
