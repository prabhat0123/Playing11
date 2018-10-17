package com.exp15.predicate;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 10, 12, 7, 8, 11, 22 };

		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("Numbers greater than 10 are");
		m1(p1,arr);
		System.out.println("Numbers LessThan than 10 are");
		m1(p1.negate(),arr);
		System.out.println("Numbers greater than 10 and even ");
		m1(p1.and(p2),arr);
		System.out.println("Numbers greater than 10 or even ");
		m1(p1.or(p2),arr);
		

	}

	public static void m1(Predicate<Integer> p, int[] arr) {
		for (int x : arr)
			if (p.test(x))
				System.out.println(x);
	}

}
