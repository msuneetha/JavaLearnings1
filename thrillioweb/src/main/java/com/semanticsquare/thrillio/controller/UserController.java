package com.semanticsquare.thrillio.controller;

import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.managers.UserManager;

public class UserController {
	
	private static UserController instance = new UserController();
	
	private UserController() {}
	
	public static UserController getInstance() {
		return instance;
	}

	public User[] getUsers() {
		return UserManager.getInstance().getUsers();
	}
}
