package com.telusko.course_app.service;

import org.springframework.stereotype.Service;

@Service
public class AIEngineering implements ICourse 
{

	@Override
	public String registerCourse() 
	{
		
		return "Registered to AI Engineering course";
	}

}
