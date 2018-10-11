package com.exp14.staticMethod;

interface Interf {

	public static void m1() {
		System.out.println("Static method");
	};
}

public class StaticInterfaceExp implements Interf {

	public static void main(String[] args) {
		StaticInterfaceExp obj = new StaticInterfaceExp();
		// obj.m1(); //wrong
		// MultiplenterfaceExp.m1(); // wrong
		Interf.m1();

	}

}
