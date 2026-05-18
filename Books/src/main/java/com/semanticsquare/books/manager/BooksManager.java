package com.semanticsquare.books.manager;

import java.util.ArrayList;
import java.util.Collection;

import com.semanticsquare.books.entities.Books;

public class BooksManager {
	
	//singleton - meaning we can create only 1 instance for the class
	private static BooksManager instance = new BooksManager();
	
	private BooksManager() {
		 
	}

	public Collection<Books> getMyBooks() {
		Collection<Books> myBooks = new ArrayList<>();
		
		Books bookone = new Books();
		
		bookone.setAuthor("Jefferey Cruze");
		bookone.setRating(4);
		bookone.setImageUrl("http://photo.goodreads.com/books/1170846378m/73968.jpg");
		
		myBooks.add(bookone);
		
		Books booktwo = new Books();
		
		booktwo.setAuthor("Hello World");
		booktwo.setRating(5);
		booktwo.setImageUrl("http://ecx.images-amazon.com/images/I/21WBe6pNO5L._SX106_.jpg");
		
		myBooks.add(booktwo);
		
		return myBooks;
		
	}

	public static BooksManager getInstance() {
		return instance;
	}

	public static void setInstance(BooksManager instance) {
		BooksManager.instance = instance;
	}
	//returns the object in string format and can be helpful to write sysout to print object
	@Override
	public String toString() {
		return "BooksManager [getMyBooks()=" + getMyBooks() + "]";
	}
}
