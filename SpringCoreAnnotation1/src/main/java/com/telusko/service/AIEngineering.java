package com.telusko.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.telusko.interfaces.ICourses;

@Service
@Primary // when there is a conflict of multiple classes to pick then primary woudl help picking that as default object
public class AIEngineering implements ICourses
	{
	
	public AIEngineering() {
		System.out.println("AI Engineering Bean created");
	}

	@Override
	public boolean registerTheCourse() {
		
		System.out.println("Successfully registered the AIEngineering course");
		return true;
	}

}
