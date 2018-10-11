package com.exp10.innerClassThis;

public class WithLambda {

	int x = 888;

	public void m2() {
		Inter1 in = () -> {
			int x =888;
			System.out.println(this.x);
			System.out.println(WithLambda.this.x);

		};
		in.m1();

	}

	public static void main(String[] args) {
		WithoutLambda obj = new WithoutLambda();
		obj.m2();
	}

}

interface Inter1 {

	public void m1();
}
