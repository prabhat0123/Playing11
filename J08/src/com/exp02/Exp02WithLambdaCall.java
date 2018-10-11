package com.exp02;

public class Exp02WithLambdaCall {

	public static void main(String[] args) {
		Inter2 i = (a,b)->System.out.println("result : "+a+b);
		i.add(2,3);
	}
}

interface Inter2 {
	public void add(int a, int b);

}
