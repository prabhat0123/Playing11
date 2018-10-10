package com.exp02;

public class Exp02WithoutLambdaCall {

	public static void main(String[] args) {
		Inter i = new InterImpl();
		i.add(2,3);
	}
}

interface Inter {
	public void add(int a, int b);

}

class InterImpl implements Inter {

	@Override
	public void add(int a, int b) {
		System.out.println("result : "+a+b);

	}

}
