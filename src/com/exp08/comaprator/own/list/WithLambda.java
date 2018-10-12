package com.exp08.comaprator.own.list;

import java.util.ArrayList;
import java.util.Collections;

public class WithLambda {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Matt"));
		employees.add(new Employee(12, "Marl"));
		employees.add(new Employee(7, "Jhon"));
		employees.add(new Employee(22, "Dan"));
		employees.add(new Employee(5, "Tina"));

		Collections.sort(employees, (o1, o2) -> (o1.getId() > o2.getId()) ? -1 : (o1.getId() < o2.getId()) ? 1 : 0);
		System.out.println(employees);

	}
}

class Employee {

	private String name;
	private int id;

	public Employee(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

}
