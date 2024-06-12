package com.app.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.entity.Movie;
import com.app.entity.MovieType;

import static com.app.utils.Validation.*;
import static com.app.utils.Utils.*;

public class Tester {

	public static void main(String[] args) {
		Map<String, Movie> mMap=new HashMap<String, Movie>();
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			while(!exit) {
				System.out.println("Enter :\n1. to add new Movie.\n2. Display all movie with all details"
						+ "\n3.Sort movies as per release Date.\n4. Display Movie names, release date, ratings by specific Movie Type"
						+ "\n5. Update Movie rating based on title (Maove Name).\n6. Remove Movie where inCinemas status is false"
						+ "\n7. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
//						movie1 movieid1 2024-06-10 5 true HOLLYWOOD
						System.out.println("Enter movieName,movieId, releaseDate, ratings, "
								+ "inCinemasStatus, movieType");
						List<Movie> mlist=new ArrayList<Movie>(mMap.values());
						String mName=sc.next();
						mMap.put(mName, validateMovie(sc.next(), mName, sc.next(), sc.nextInt(), sc.nextBoolean(), sc.next().toUpperCase(),mlist ));
						System.out.println("------Movie added Successfully-----");
						break;
						
					case 2:
						System.out.println("Movie details are :");
						mMap.values().forEach(m->System.out.println(m));
						break;
					case 3:
						List<Movie> mlist2=new ArrayList<Movie>(mMap.values());
						Collections.sort(mlist2,(m1,m2)->(m1.getReleaseDate()).compareTo(m2.getReleaseDate()));
						System.out.println("Sorted movies as per release Date are :"); 
						mlist2.stream().forEach(m->System.out.println(m));
						break;
					case 4:
//						Display Movie names, release date, ratings by specific Movie Type
						System.out.println("Enter Movie Type :");
						fetchAccMovieType(mMap,MovieType.valueOf(sc.next().toUpperCase()));
						break;
					case 5:
//						Update Movie reting based on title (Maovie Name).
						System.out.println("Enter movie name and new Rating :");
						mMap.get(sc.next()).setRatings(sc.nextInt());
						break;
						
					case 6:
						//boolean b=sc.nextBoolean();
//						mMap.values().stream().filter(s->s.isInCinemasStatus()).map(s->mMap.remove(s)).forEach(s->System.out.println(s));
						
//						Remove Movie where inCinemas status is false
						List<Movie> mlist3=new ArrayList<Movie>(mMap.values());
						Iterator<Movie> itr= mMap.values().iterator();
						while(itr.hasNext()) {
							if(itr.next().isInCinemasStatus()==false) {
								itr.remove();
								System.out.println("-----movie removed --------");
							}
						}
						
						break;
					case 7:
						exit=true;
						System.out.println("-----You have exited the program----");
						break;

					default:
						break;
					}
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
