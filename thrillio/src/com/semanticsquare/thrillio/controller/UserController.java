package com.semanticsquare.thrillio.controller;

import java.util.List;

import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.managers.UserManager;

public class UserController {
	
	private static UserController instance = new UserController();
	
	private UserController() {}
	
	public static UserController getInstance() {
		return instance;
	}

	public List<User> getUsers() {
		return UserManager.getInstance().getUsers();
	}
}
