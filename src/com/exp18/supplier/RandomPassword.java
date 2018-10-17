package com.exp18.supplier;

import java.util.function.Supplier;

public class RandomPassword {

	public static void main(String[] args) {

		Supplier<String> password = () -> {
			String pwd = "";
			Supplier<Integer> degit = () -> (int) (Math.random() * 10);
			String alphabates = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> alpha = () -> alphabates.charAt((int) (Math.random() * 29));

			for (int a = 1; a <= 8; a++) {
				if (a % 2 == 0)
					pwd = pwd + degit.get();
				else
					pwd = pwd + alpha.get();
			}

			return pwd;

		};
		System.out.println(password.get());
	}

}
