package com.semanticsquare.thrillio.Dao;

import java.util.List;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.entities.UserBookmark;

public class BookmarkDao {
	
	public static List<List<Bookmark>> getBookmarks() {
		return DataStore.getBookmarks();
	}
	
	public static void saveUserBookmark(UserBookmark userBookMark) {
		 DataStore.add(userBookMark);
	}

}
