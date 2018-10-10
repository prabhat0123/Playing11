package com.exp03;

public class Exp03WithLambdaCall {

	public static void main(String[] args) {
		Inter2 i = (s)-> s.length();
		System.out.println(i.len("1234567"));
	}
}

interface Inter2 {
	public int len(String string);

}
