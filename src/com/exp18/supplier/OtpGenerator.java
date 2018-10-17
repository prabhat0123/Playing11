package com.exp18.supplier;

import java.util.function.Supplier;

public class OtpGenerator {

	public static void main(String[] args) {

		Supplier<String> c = () -> {
			String otp="";
			for(int a=0;a<6;a++)
				otp=otp+(int) (Math.random() * 10);
				return otp;
		};
		System.out.println(c.get());
	}

}
 