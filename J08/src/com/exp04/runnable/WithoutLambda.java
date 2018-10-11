package com.exp04.runnable;

public class WithoutLambda {

	public static void main(String[] args) {
		Runnable run = new MyRunnable();
		Thread t = new Thread(run);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}

	}

}
