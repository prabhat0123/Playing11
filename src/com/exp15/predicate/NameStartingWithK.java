package com.exp15.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class NameStartingWithK {

	public static void main(String[] args) {

		String arr[] = { "PRABHAT", " ", null, "KING", "JHON" };
		Predicate<String> p = s -> s != null && s.length() != 0;
		ArrayList<String> names = new ArrayList<>();

		for (String s : arr)
			if (p.test(s))
				names.add(s);

	}

	public static void m1(Predicate<String> p, String[] arr) {
		for (String s : arr) {
			if (p.test(s))
				System.out.println(s);
		}
	}

}
