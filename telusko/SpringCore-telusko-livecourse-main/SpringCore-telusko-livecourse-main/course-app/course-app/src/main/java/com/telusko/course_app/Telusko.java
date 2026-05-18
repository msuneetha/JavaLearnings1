package com.telusko.course_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.telusko.course_app.service.ICourse;

@Component
public class Telusko 
{
	@Autowired
	@Qualifier("java")
	private ICourse course;
	
	public String getTheCourse()
	{
		return course.registerCourse();
	}

}
