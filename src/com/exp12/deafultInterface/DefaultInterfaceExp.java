package com.exp12.deafultInterface;

interface Inter1 {

	default void m1() {
		System.out.println("Default Method");
	};
}

class C1 implements Inter1 {

}

class C2 implements Inter1 {
	public void m1() {
		System.out.println("override default Method");
	};
}

public class DefaultInterfaceExp {

	public static void main(String[] args) {
		C1 c1 = new C1();
		C2 c2 = new C2();

		c1.m1();
		c2.m1();
	}

}
