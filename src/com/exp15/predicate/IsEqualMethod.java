package com.exp15.predicate;

import java.util.function.Predicate;

public class IsEqualMethod {

	public static void main(String[] args) {
		
		Predicate<String> p = Predicate.isEqual("Prabhat");
		System.out.println(p.test("Hello"));
		System.out.println(p.test("Prabhat"));
		

	}

}
