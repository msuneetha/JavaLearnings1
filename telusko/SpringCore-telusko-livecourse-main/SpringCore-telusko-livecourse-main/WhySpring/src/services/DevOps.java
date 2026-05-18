package services;

public class DevOps implements ICourse
{

	@Override
	public boolean registerTheCourse(double amount)
	{
		System.out.println("Registered in DevOps course of Telusko and fees paid is "+amount);
		return true;
	}

}
