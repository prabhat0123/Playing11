package com.exp05.comaprator.list;

import java.util.ArrayList;
import java.util.Collections;

public class WithLambda {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(10);
		al.add(5);
		al.add(7);

		Collections.sort(al);
		System.out.println(al);

		Collections.sort(al, new MyComaparator());
		System.out.println(al);

		Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		System.out.println(al);

	}
}

