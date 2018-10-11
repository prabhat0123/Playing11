package com.exp07.comaprator.map;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class WithoutLambda {

	public static void main(String[] args) {

		TreeMap<Integer,String> al = new TreeMap<Integer,String>();
		al.put(1,"A");
		al.put(11,"AB");
		al.put(10,"CA");
		al.put(7,"AT");
		al.put(12,"DA");
		
		System.out.println(al);
		
		TreeMap<Integer,String> all = new TreeMap<Integer,String>((o1,o2)->(o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		all.put(1,"A");
		all.put(11,"AB");
		all.put(10,"CA");
		all.put(7,"AT");
		all.put(12,"DA");
		
		System.out.println(all);


	}

}

