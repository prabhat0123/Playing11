package com.exp17.consumer;

import java.util.function.Consumer;

public class AcceptTest {

	public static void main(String[] args) {
		
		Consumer<String> c = (s)->System.out.println(s);
		c.accept("Prabhat");
	}

}
