package com.exp03;

public class Exp03WithoutLambdaCall {

	public static void main(String[] args) {
		Inter i = new InterImpl();
		System.out.println(i.len("1234567"));
	}
}

interface Inter {
	public int len(String string);

}

class InterImpl implements Inter {

	@Override
	public int len(String string) {
		return string.length();

	}

}
