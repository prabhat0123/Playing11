package com.exp15.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CollectionEmptyCheck {

	public static void main(String[] args) {
		
		Predicate<Collection> p= s->s.isEmpty();
		System.out.println(p.test(new ArrayList()));
		

	}

}
