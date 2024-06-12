package com.app.utils;

import java.util.Map;

import com.app.entity.Movie;
import com.app.entity.MovieType;

public class Utils {
	public static void fetchAccMovieType(Map<String, Movie> mMap,MovieType mType) {
		mMap.values().stream()
		.filter(m->m.getMovieType()==mType)
		 .forEach(m->System.out.println(m));
	}
}
