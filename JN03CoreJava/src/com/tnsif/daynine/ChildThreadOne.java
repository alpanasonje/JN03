//Program to define child thread class
package com.tnsif.daynine;

public class ChildThreadOne extends Thread {
	//task of the thread
	@Override
	public void run() {
		ThreadDemo.fibonacci(10);
	}
}
