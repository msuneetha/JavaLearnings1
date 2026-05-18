package com.telusko.controller;

import org.springframework.stereotype.Controller;

//stereo type annotations
@Controller //Creates bean of this class along with info that its Web interaction layer or controller layer
public class ControllerLayer {
	
	public ControllerLayer()
	{
		System.out.println("Inside my controller layer");
	}

}
