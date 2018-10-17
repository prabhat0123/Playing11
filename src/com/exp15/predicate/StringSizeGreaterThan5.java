package com.exp15.predicate;

import java.util.function.Predicate;

public class StringSizeGreaterThan5 {

	public static void main(String[] args) {
		
		Predicate<String> p= s->s.length()>5;
		System.out.println(p.test("abc"));
		System.out.println(p.test("abcde"));
		System.out.println(p.test("abcdef"));
	}

}
