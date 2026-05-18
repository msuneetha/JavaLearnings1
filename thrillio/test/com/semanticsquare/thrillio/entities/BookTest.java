package com.semanticsquare.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.semanticsquare.thrillio.constants.BookGenre;
import com.semanticsquare.thrillio.managers.BookmarkManager;

class BookTest {

	@Test
	void testIsKidFriendlyEligible() {
		
		//Test 1 - Philosophy - returns false
		Book book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David", "Thoreau" }, BookGenre.PHILOSOPHY, 4.3);
		
		Boolean isKidFriendlyEligible = book.isKidFriendlyEligible();
		
		assertFalse(isKidFriendlyEligible, "Book Genre Philosophy in isKidFriendlyEligible() should return false");
		
		//Test 2 - Self help - returns false
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David", "Thoreau" }, BookGenre.SELF_HELP, 4.3);
		
		isKidFriendlyEligible = book.isKidFriendlyEligible();
		
		assertFalse(isKidFriendlyEligible, "Book Genre Self help in isKidFriendlyEligible() should return false");
		
	}

}
