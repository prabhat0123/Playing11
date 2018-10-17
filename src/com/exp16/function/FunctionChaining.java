package com.exp16.function;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		
		Function<String, String> upperCase = str -> str.toUpperCase();
		Function<String, String> first10 = str -> str.substring(0, 9);
		
		System.out.println(upperCase.andThen(first10).apply("ABCDEFGHIJKLMNOP"));
		
		System.out.println(first10.compose(upperCase).apply("ABCDEFGHIJKLMNOP"));
		
		
		Function<Integer, Integer> doubles = i -> i+i;
		Function<Integer, Integer> cubes = i -> i*i*i;
		
		System.out.println(doubles.andThen(cubes).apply(2));
		System.out.println(doubles.compose(cubes).apply(2));
	}

}
