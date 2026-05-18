package com.telusko.service;

import org.springframework.stereotype.Service;

import com.telusko.interfaces.ICourses;

@Service
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
