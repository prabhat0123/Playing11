package com.exp13.multipleInterface;

interface Left {

	default void m1() {
		System.out.println("Left Default Method");
	};
}
interface Right {

	default void m1() {
		System.out.println("Right Default Method");
	};
}


public class MultiplenterfaceExp implements Left, Right{

	public static void main(String[] args) {
		MultiplenterfaceExp obj = new MultiplenterfaceExp();
		obj.m1();

	}

	@Override
	public void m1() {
		System.out.println("Overiding left");
		Left.super.m1();
	}

}
