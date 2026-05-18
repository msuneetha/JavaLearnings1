package com.semanticsquare.thrillio;

import java.util.List;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.entities.UserBookmark;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.managers.UserManager;

public class Launch {

	private static List<User> users;
	private static List<List<Bookmark>> bookmarks;

	private static void launchData() {
		loadUsers();
		//printUserData();
		loadBookmarks();
		//printBookmarks();
	}

	private static void printBookmarks() {

		for (List<Bookmark> bookmarkType : bookmarks) {
			for (Bookmark bookmark : bookmarkType) {
				System.out.println(bookmark);
			}
		}
	}

	private static void printUserData() {

		for (User user : users) {
			System.out.println(user);
		}
	}

	private static void loadUsers() {
		users = UserManager.getInstance().getUsers();
	}

	private static void loadBookmarks() {
		bookmarks = BookmarkManager.getInstance().getBookmarks();
	}

	private static void start() {
		System.out.println("2. Adding Userbookmarks....");
		for (User user : users) {
			View.browse(user, bookmarks);
		}
	}

	public static void main(String[] args) {
		System.out.println("1. Loading the Data....");
		DataStore.loadData();
		launchData();
		start();
	}

}
