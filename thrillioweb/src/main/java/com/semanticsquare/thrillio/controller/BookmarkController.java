package com.semanticsquare.thrillio.controller;

import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.UserBookmark;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.entities.User;

public class BookmarkController {
	
	private static BookmarkController instance = new BookmarkController();
	
	private BookmarkController() {}
	
	public static BookmarkController getInstance() {
		return instance;
	}
	
	public Bookmark[][] getBookmarks() {
		return BookmarkManager.getInstance().getBookmarks();
	}
	
	public void saveUserBookmark(User user, Bookmark bookmark) {
		 BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
	}

	public void setKidFriendlyStatus(String kidFriendlyStatus, Bookmark bookmark, User user) {
		BookmarkManager.getInstance().setKidFriendlyStatus(kidFriendlyStatus, bookmark, user);
		
	}

	public void share(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().share(user, bookmark);
		
	}

}
