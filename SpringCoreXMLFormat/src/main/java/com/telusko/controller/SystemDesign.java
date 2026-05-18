package com.telusko.controller;

import com.telusko.interfaces.ICourses;

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
