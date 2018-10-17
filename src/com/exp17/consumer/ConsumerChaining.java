package com.exp17.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {

		List<Movie1> movies = populate();
		Consumer<Movie1> mName = (movie) -> {
			System.out.println(movie.nameMovie);
		};
		Consumer<Movie1> mAcName = (movie) -> {
			System.out.println(movie.nameActor);
		};
		Consumer<Movie1> mAcrName = (movie) -> {
			System.out.println(movie.nameActoress);
		};
		for (Movie1 movie : movies) {
			mName.andThen(mAcrName).andThen(mAcName).accept(movie);
			System.out.println("");
		}
			
	}

	private static List<Movie1> populate() {
		List<Movie1> movies = new ArrayList<>();
		movies.add(new Movie1("Actor1", "Actoress1", "Movie1"));
		movies.add(new Movie1("Actor2", "Actoress2", "Movie2"));
		movies.add(new Movie1("Actor3", "Actoress3", "Movie3"));

		return movies;
	}

}

class Movie1 {
	String nameActor;
	String nameActoress;
	String nameMovie;

	public Movie1(String nameActor, String nameActoress, String nameMovie) {
		super();
		this.nameActor = nameActor;
		this.nameActoress = nameActoress;
		this.nameMovie = nameMovie;
	}

}
