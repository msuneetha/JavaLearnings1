package com.semanticsquare.thrillio.Dao;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.entities.UserBookmark;

public class BookmarkDao {
	
	public static Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}
	
	public static void saveUserBookmark(UserBookmark userBookMark) {
		 DataStore.add(userBookMark);
	}

}
