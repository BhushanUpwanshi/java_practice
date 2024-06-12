package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.customexcption.CustException;
import com.app.entity.Movie;
import com.app.entity.MovieType;

public class Validation {
	public static String validateMovieId(String mId) throws CustException{
		if(mId.length()==8) {
			return mId;
		}else 
			throw new CustException("Invalid Movie Id length");
	}
	
	public static LocalDate validateReleaseDate(LocalDate rdate) throws CustException {
		if(rdate.isBefore(LocalDate.now())) {
			throw new CustException("Movie release date cannot be before todays date");
		}
		return rdate;
	}
	
	public static String validateDups(String mName,List<Movie> mlist) throws CustException {
		for(Movie m1:mlist) {
			if(m1.getMovieName().equals(mName))
				throw new CustException("Movie already exists: Cannot add duplicate movie");
		}
		return mName;
	}
	
	public static MovieType validatMovieType(String mType) throws CustException {
		try {
		return MovieType.valueOf(mType);
		}catch (Exception e) {
			throw new CustException("Movie Type is Invalid Please provide valid movie type. ");
		}
	}
	
	public static Movie validateMovie(String movieId, String movieName, String releaseDate,
			int ratings, boolean inCinemasStatus,
			String movieType, List<Movie> mlist) throws CustException {
		
		return  new Movie(validateMovieId(movieId), validateDups(movieName, mlist), 
				validateReleaseDate(LocalDate.parse(releaseDate)), ratings, 
				inCinemasStatus,validatMovieType(movieType));
	}
	
}
