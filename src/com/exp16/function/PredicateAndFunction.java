package com.exp16.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateAndFunction {

	/**
	 * >=80 A >=60 B >=50=c >=35=D else =E
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		ArrayList<Employee> list = createList();
		ArrayList<Employee> IncList = new ArrayList<Employee>();
		System.out.println(list);

		Function<Employee, Employee> funcIncrSal = emp -> {
			emp.salary = emp.salary + 477;
			return emp;
		};

		Predicate<Employee> ifSalaryLessThan3000 = emp -> emp.salary <= 3000;

		for (Employee emp : list)
			if (ifSalaryLessThan3000.test(emp)) {
				funcIncrSal.apply(emp);
				IncList.add(emp);
			}
		System.out.println(IncList);

	}

	public static ArrayList<Employee> createList() {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("Emp 1", 1000));
		list.add(new Employee("Emp 2", 2000));
		list.add(new Employee("Emp 3", 3000));
		list.add(new Employee("Emp 4", 4000));
		list.add(new Employee("Emp 5", 5000));
		return list;
	}

}

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
