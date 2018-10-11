package com.exp10.innerClassThis;

public class WithoutLambda {

	int x = 888;

	public void m2() {
		Inter in = new Inter() {
			int x = 999;

			@Override
			public void m1() {
				System.out.println(this.x);
				System.out.println(WithoutLambda.this.x);

			}
		};
		in.m1();

	}

	public static void main(String[] args) {
		WithoutLambda obj = new WithoutLambda();
		obj.m2();
	}

}

interface Inter {

	public void m1();
}
