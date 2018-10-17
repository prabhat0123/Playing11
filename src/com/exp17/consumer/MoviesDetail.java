package com.exp17.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MoviesDetail {

	public static void main(String[] args) {

		List<Movie> movies = populate();
		Consumer<Movie> m = (movie) -> {
			System.out.println(movie.nameActor);
			System.out.println(movie.nameActoress);
			System.out.println(movie.nameMovie);
			System.out.println("");
		};
		for (Movie movie : movies)
			m.accept(movie);
	}

	private static List<Movie> populate() {
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("Actor1", "Actoress1", "Movie1"));
		movies.add(new Movie("Actor2", "Actoress2", "Movie2"));
		movies.add(new Movie("Actor3", "Actoress3", "Movie3"));

		return movies;
	}

}

class Movie {
	String nameActor;
	String nameActoress;
	String nameMovie;

	public Movie(String nameActor, String nameActoress, String nameMovie) {
		super();
		this.nameActor = nameActor;
		this.nameActoress = nameActoress;
		this.nameMovie = nameMovie;
	}

}
