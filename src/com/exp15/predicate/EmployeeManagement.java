package com.exp15.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeManagement {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> empList = new ArrayList<>();
		Employee emp1= new Employee("Emp 1","CEO",1000d,"HYD");
		Employee emp2= new Employee("Emp 2","MD",900d,"HYD");
		Employee emp3= new Employee("Emp 3","CFO",800d,"BNG");
		Employee emp4= new Employee("Emp 4","CTO",700d,"DLI");
	
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		//predicate to check 
		
		Predicate<Employee> ceo = emp -> emp.designation.equals("CEO");
		display(ceo,empList);
		Predicate<Employee> banglore = emp -> emp.city.equals("BNG");
		display(banglore,empList);
		
		
	}
	
	public static void display(Predicate<Employee> empPre , ArrayList<Employee> empList) {
		for(Employee emp :empList) {
		 if(empPre.test(emp))
			 System.out.println(emp);
		}
	}

}

class Employee {
	String name;
	String designation;
	double salary;
	String city;

	public Employee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city
				+ "]";
	}

}
