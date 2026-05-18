package com.semanticsquare.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.semanticsquare.thrillio.managers.BookmarkManager;

class WebLinkTest {

	@Test
	void testIsKidFriendly() {
		//test1 - porn in url -- return false
		WebLink webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html",
				"http://www.javaworld.com");
		Boolean isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible, "For porn in url - isKidFriendlyEligible() should return false ");
		
		//test2 - porn in title -- return false		
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming porn, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible, "For porn in title - isKidFriendlyEligible() should return false ");

		//test3 - adult in host --return false		
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.adult.com");
		isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertFalse(isKidFriendlyEligible, "For adult in host - isKidFriendlyEligible() should return false ");
		
		//test4 - adult in url but not in host - true
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-adult--part-2.html",
				"http://www.javaworld.com");
		isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertTrue(isKidFriendlyEligible, "For adult in url only - isKidFriendlyEligible() should return true ");
		
		//test5 - adult in title only - true
		webLink = BookmarkManager.getInstance().createWebLink(2000, "Taming adult, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		isKidFriendlyEligible = webLink.isKidFriendlyEligible();
		assertTrue(isKidFriendlyEligible, "For adult in title - isKidFriendlyEligible() should return true ");
	}

}
