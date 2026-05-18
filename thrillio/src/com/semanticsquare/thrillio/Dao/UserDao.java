package com.semanticsquare.thrillio.Dao;

import java.util.List;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entities.User;

public class UserDao {
	
	public static List<User> getUsers() {
		return DataStore.getUsers();
	}

}
