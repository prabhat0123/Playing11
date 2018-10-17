package com.exp15.predicate;

import java.util.function.Predicate;

public class RemoveNullAndEmptyString {

	public static void main(String[] args) {

		String arr[] = { "PRABHAT", "KUMAR", "KATE", "KING", "JHON" };
		Predicate<String> p = s -> s.startsWith("K");
		m1(p,arr);

	}

	public static void m1(Predicate<String> p, String[] arr) {
		for (String s : arr) {
			if (p.test(s))
				System.out.println(s);
		}
	}

}
