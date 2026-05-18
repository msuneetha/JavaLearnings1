package com.telusko.dao;

import org.springframework.stereotype.Repository;

//stereo type annotation
@Repository // This creates the Bean of this class and gives info that its repository layer or DB layer
public class RepositoryLayer {
	
	public RepositoryLayer() {
		System.out.println("Inside repository Layer");
	}

}
