package com.exp01;

public class Exp01WithLambdaCall {

	public static void main(String[] args) {
		Inter2 i = () -> System.out.println("M1 is called");
		i.m1();

	}
}

interface Inter2 {
	public void m1();

}