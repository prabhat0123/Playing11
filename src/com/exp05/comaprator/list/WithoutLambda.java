package com.exp05.comaprator.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WithoutLambda {

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

		Collections.sort(al, new MyComaparator());
		System.out.println(al);

	}

}

class MyComaparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
	}
}
