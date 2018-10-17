package com.exp16.function;

import java.util.function.Function;

public class SqOfNum {

	public static void main(String[] args) {
		
		Function<String,Integer> fun = s->s.length();
		System.out.println(fun.apply("Hello World"));
		

	}

}
