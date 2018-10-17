package com.exp19.biPredicate;

import java.util.function.BiPredicate;

public class AplusBisEven {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> biPre = (a, b) -> (a + b) % 2 == 0;
		System.out.println(biPre.test(2, 5));
		System.out.println(biPre.test(2, 4));
	}

}
