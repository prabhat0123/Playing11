package com.exp15.predicate;

import java.util.function.Predicate;

public class NumGreaterThan10 {

	public static void main(String[] args) {
		
		Predicate<Integer> p= i->i>10;
		System.out.println(p.test(100));
	}

}
