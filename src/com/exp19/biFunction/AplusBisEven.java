package com.exp19.biFunction;


import java.util.function.BiFunction;

public class AplusBisEven {

	public static void main(String[] args) {

		BiFunction<Integer,Integer, Integer> biFun = (a, b) -> a*b;
		System.out.println(biFun.apply(2, 5));
		System.out.println(biFun.apply(2, 4));
	}

}
