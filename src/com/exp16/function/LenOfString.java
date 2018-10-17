package com.exp16.function;

import java.util.function.Function;

public class LenOfString {

	public static void main(String[] args) {
		
		Function<Integer,Integer> fun = num->num*num;
		System.out.println(fun.apply(4));
		

	}

}
