package com.exp19.biFunction;

import java.util.function.BiFunction;

public class StudentExp {

	public static void main(String[] args) {

		BiFunction<String, Integer,Student> biFun = (name,roll) -> new Student(name,roll);
		System.out.println(biFun.apply("Prabhat",1));
		System.out.println(biFun.apply("Kumar",2));
	}

}


class Student{
	
	String name;
	int roll;
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}
	
	
}
