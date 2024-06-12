package com.app.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Movie {
	private String movieId;
	private String movieName;
	private LocalDate releaseDate;
	private int ratings;
	private boolean inCinemasStatus;
	private MovieType movieType;
	public Movie(String movieId, String movieName, LocalDate releaseDate, int ratings, boolean inCinemasStatus,
			MovieType movieType) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.releaseDate = releaseDate;
		this.ratings = ratings;
		this.inCinemasStatus = inCinemasStatus;
		this.movieType = movieType;
	}
	public Movie(String movieName) {
		this.movieName=movieName;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public boolean isInCinemasStatus() {
		return inCinemasStatus;
	}
	public void setInCinemasStatus(boolean inCinemasStatus) {
		this.inCinemasStatus = inCinemasStatus;
	}

	public MovieType getMovieType() {
		return movieType;
	}
	public void setMovieType(MovieType movieType) {
		this.movieType = movieType;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", releaseDate=" + releaseDate + ", ratings="
				+ ratings + ", inCinemasStatus=" + inCinemasStatus + ", movieType=" + movieType + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(movieType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return movieType == other.movieType;
	}
	
}
