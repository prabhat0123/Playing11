package com.exp16.function;

import java.util.function.Function;

public class StudentGrade {
	
	/**
	 * >=80 A
	 * >=60 B
	 * >=50=c
	 * >=35=D
	 * else =E
	 * @param args
	 */

	public static void main(String[] args) {
		Student s1 = new Student("ABC",100);
		Student s2 = new Student("DEF",65);
		Student s3 = new Student("GHI",55);
		Student s4 = new Student("JKL",45);		
		Student s5 = new Student("MNO",30);

		
		
		
		Function<Student,String> gradeFun = student -> {
			if(student.marks>=80)
				return "A";
			else if (student.marks>=60)
				return "B";
			else if (student.marks>=50)
				return "C";
			else if (student.marks>=35)
				return "D";
			else return "E";
		};
		System.out.println(gradeFun.apply(s1));
		System.out.println(gradeFun.apply(s2));
		System.out.println(gradeFun.apply(s3));
		System.out.println(gradeFun.apply(s4));
		System.out.println(gradeFun.apply(s5));
		

	}

}

class Student 
{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
}
