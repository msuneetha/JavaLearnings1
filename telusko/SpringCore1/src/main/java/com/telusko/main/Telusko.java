package com.telusko.main;

import org.springframework.stereotype.Component;

//stereo type annotation
// this would create bean of this class .. and this is just a noraml class
@Component
public class Telusko {
	
	public Telusko() {
		System.out.println("In telusko class");
	}

}
