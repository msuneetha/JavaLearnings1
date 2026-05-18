package com.semanticsquare.thrillio.entities;

import java.util.Arrays;

import com.semanticsquare.thrillio.constants.MovieGenre;

public class Movie extends Bookmark {

	private int releaseYear;
	private String[] cast;
	private String[] director;
	private String genre;
	private double imdbRating;
	
	public Movie(long id, String title,  int releaseYear, String[] cast, String[] director,
			String genre, double imdbRating) {
		
		this.setId(id);
		this.setTitle(title);
		this.releaseYear = releaseYear;
		this.cast = cast;
		this.director = director;
		this.genre = genre;
		this.imdbRating = imdbRating;		

	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String[] getCast() {
		return cast;
	}

	public void setCast(String[] cast) {
		this.cast = cast;
	}

	public String[] getDirector() {
		return director;
	}

	public void setDirector(String[] director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}

	@Override
	public String toString() {
		return "Movie [releaseYear=" + releaseYear + ", cast=" + Arrays.toString(cast) + ", director="
				+ Arrays.toString(director) + ", genre=" + genre + ", imdbRating=" + imdbRating + "]";
	}

	@Override
	public boolean isKidFriendlyEligible() {
		// TODO Auto-generated method stub
		if(genre.equals(MovieGenre.THRILLERS) || genre.equals(MovieGenre.HORROR)) {
			return false;
		}
		return true;
	}

}
