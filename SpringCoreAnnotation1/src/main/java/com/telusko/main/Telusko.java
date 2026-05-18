package com.telusko.main;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.telusko.interfaces.ICourses;

//stereo type annotation
// this would create bean of this class .. and this is just a noraml class
@Component
public class Telusko {
	
	//@Autowired
	//@Qualifier("DevOps")
	private ICourses course;
	
	//setter Injection
	//@Autowired // injecting dependency via setter
	//@Qualifier("devOps") // here we need to give object created by spring which is camel case of the Class name unless specified 
	//Qualifier takes priority over Primary
	public void setCourse(ICourses course) {
		this.course = course;
	}
	public Telusko() 
	{
		System.out.println("telusko bean is created");
	}

	//constructor Injection
	@Autowired
	//@Qualifier . This annotation is not allowed for Constructor so we need to add it as parameter 
	public Telusko(@Qualifier("devOps")ICourses course) {
		this.course = course;
		System.out.println("Inside Telusko");
	}
	
	public void register()
	{
		course.registerTheCourse();
	}

}
