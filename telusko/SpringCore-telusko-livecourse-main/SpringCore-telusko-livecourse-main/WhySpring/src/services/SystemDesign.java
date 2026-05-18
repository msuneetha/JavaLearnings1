package services;

public class SystemDesign implements ICourse
{

	@Override
	public boolean registerTheCourse(double amount)
	{
		System.out.println("Registered in SystemDesign course of Telusko and fees paid is "+amount);
		return true;
	}
}
