package main;

import services.DevOps;
import services.ICourse;

public class Telusko
{
	private ICourse course;
	

	
	public Telusko(ICourse course) {
		super();
		this.course = course;
	}
	

	public Telusko() {
		super();
		// TODO Auto-generated constructor stub
	}


	//setter
	public void setCourse(ICourse course)//ICourse course=new DevOps();
	{
		this.course = course;
	}

	public boolean buyTheCouuse(double amount)
	{
	
//		Boolean status=course.registerTheCourse(amount);
//		return status;
		return course.registerTheCourse(amount);
	}

}
