package com.telusko.main;

import org.springframework.stereotype.Component;

import com.telusko.interfaces.ICourses;

//stereo type annotation
// this would create bean of this class .. and this is just a noraml class
@Component
public class Telusko {
	
	private ICourses course;
	
	public void setCourse(ICourses course) {
		this.course = course;
	}
	public Telusko() 
	{
		System.out.println("telusko bean is created");
	}

	public Telusko(ICourses course) {
		this.course = course;
		System.out.println("Inside Telusko");
	}
	
	public void register()
	{
		course.registerTheCourse();
	}

}
