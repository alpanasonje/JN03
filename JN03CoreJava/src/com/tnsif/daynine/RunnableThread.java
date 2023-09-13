//Program to define implementable class for Runnable interface
package com.tnsif.daynine;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10; i += 2)
			System.out.print(Thread.currentThread().getName()+i + " ");

	}

}
