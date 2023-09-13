//Program to define child thread class
package com.tnsif.daynine;

public class ChildThreadTwo extends Thread {
	//task of the thread
	@Override
	public void run() {
		ThreadDemo.generatePrime(10);
	}
}
