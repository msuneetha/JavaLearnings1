package com.telusko.service;

import org.springframework.stereotype.Service;

import com.telusko.interfaces.ICourses;

@Service
public class SystemDesign implements ICourses
{

	public SystemDesign() {
		
		System.out.println("System design bean is created");
		
	}
	
	@Override
	public boolean registerTheCourse() {
		
		System.out.println("Successfully registered System Design course");
		return true;
	}

}
