package com.exp16.function;

import java.util.function.Function;

public class IdentityMethod {

	public static void main(String[] args) {
		
		Function<String, String> fun = Function.identity();
		String s = fun.apply("Prabhat");
		System.out.println(s);
	}

}
