package com.exp11.finalInLambda;

import com.exp10.innerClassThis.WithoutLambda;

interface Inter1 {

	public void m1();
}

public class WithLambda {

	int y = 888;

	public void m2() {
		int x=222;
		Inter1 in = () -> {
			System.out.println(x);
			System.out.println(y);
			// x=333; cannot as it is final default;

		};
		in.m1();

	}

	public static void main(String[] args) {
		WithoutLambda obj = new WithoutLambda();
		obj.m2();
	}

}


