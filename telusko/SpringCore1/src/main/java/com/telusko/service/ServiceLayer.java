package com.telusko.service;

import org.springframework.stereotype.Service;

//stereo type annotation 
@Service  // creates bean of thsi class and also information that its a Service layer where business logic resides
public class ServiceLayer {
	
	public ServiceLayer() {
		System.out.println("In service layer");
	}

}
