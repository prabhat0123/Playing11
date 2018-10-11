package com.exp01;

public class Exp01WithoutLambdaCall {

	public static void main(String[] args) {
		Inter i = new InterImpl();
		i.m1();
	}
}

interface Inter {
	public void m1();

}

class InterImpl implements Inter {

	@Override
	public void m1() {
		System.out.println("M1 is called");

	}

}
