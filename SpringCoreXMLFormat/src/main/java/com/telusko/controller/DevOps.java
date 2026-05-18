package com.telusko.controller;

import com.telusko.interfaces.ICourses;

public class DevOps implements ICourses
{
	
	public DevOps() {
		System.out.println("Devops bean is created");
	}

	@Override
	public boolean registerTheCourse() {
		
		System.out.println("successfully registered Dev ops course");
		return true;
	}

}
