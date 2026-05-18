package com.telusko.course_app.service;

import org.springframework.stereotype.Service;

@Service
public class Java implements ICourse
{

	@Override
	public String registerCourse()
	{
		
		return "Registered to Java/SpringBoot course";

	}

}
