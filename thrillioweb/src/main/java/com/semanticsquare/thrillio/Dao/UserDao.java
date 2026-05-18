package com.semanticsquare.thrillio.Dao;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entities.User;

public class UserDao {
	
	public static User[] getUsers() {
		return DataStore.getUsers();
	}

}
