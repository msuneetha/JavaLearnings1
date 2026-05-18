package com.telusko.controller;

import com.telusko.interfaces.ICourses;

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
