package com.exp06.comaprator.set;

import java.util.Comparator;
import java.util.TreeSet;

public class WithoutLambda {

	public static void main(String[] args) {

		TreeSet<Integer> al = new TreeSet<>();
		al.add(1);
		al.add(2);
		al.add(10);
		al.add(5);
		al.add(7);
		
		System.out.println(al);
		
		TreeSet<Integer> all = new TreeSet<>(new MyComaparator());
		all.add(1);
		all.add(2);
		all.add(10);
		all.add(5);
		all.add(7);
		
		System.out.println(all);


	}

}

class MyComaparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
	}
}
