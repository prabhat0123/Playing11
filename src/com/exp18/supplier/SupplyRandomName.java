package com.exp18.supplier;

import java.util.function.Supplier;

public class SupplyRandomName {

	public static void main(String[] args) {

		Supplier<String> c = () -> {
			String[] name = { "Name1", "Name2", "Name3", "Name4", "Name5" };

			int a = (int) (Math.random() * 5);
			return name[a];
		};
		System.out.println(c.get());
	}

}
 