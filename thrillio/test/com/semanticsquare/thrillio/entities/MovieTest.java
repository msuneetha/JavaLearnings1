package com.semanticsquare.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.semanticsquare.thrillio.constants.MovieGenre;
import com.semanticsquare.thrillio.managers.BookmarkManager;

class MovieTest {

	@Test
	void testIsKidFriendlyEligible() {
		//Test 1 - Thriller should return false
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.THRILLERS,
				8.5);
		Boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible, "For Movie Type Thrillers - isKidFriendlyEligible() should return false");
		
		//Test 2 - Horror - Should return false
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.HORROR,
				8.5);
		isKidFriendlyEligible = movie.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible, "For Movie Type Horror - isKidFriendlyEligible() should return false");
	}

}
