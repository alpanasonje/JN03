//Program to define child thread class
package com.tnsif.daynine;

public class MyChildThread extends Thread {
	public MyChildThread(String name) {
		setName(name);
		start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++)
			System.out.println("Hello " + i + " by " + currentThread().getName());
	}
}
