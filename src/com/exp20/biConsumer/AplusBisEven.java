package com.exp20.biConsumer;

import java.util.function.BiConsumer;

public class AplusBisEven {

	public static void main(String[] args) {

	BiConsumer<String, String> biCon = (s1,s2)-> System.out.println( s1+s2);
	biCon.accept("Prabhat ","Kumar");
	
	}

}
