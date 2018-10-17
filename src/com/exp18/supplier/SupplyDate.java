package com.exp18.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplyDate {

	public static void main(String[] args) {
		
		Supplier<Date> c = ()->new Date();
		System.out.println(c.get());
	}

}
