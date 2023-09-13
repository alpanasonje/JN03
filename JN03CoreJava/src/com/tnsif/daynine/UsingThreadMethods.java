package com.tnsif.daynine;

public class UsingThreadMethods {

	public static void main(String[] args)  {
		// using Lambda Expression
		Runnable r = () -> { //run method implementation
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + i + ", ");

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		};

		Thread t1 = new Thread(r, "First ");
		Thread t2 = new Thread(r);
		t2.setName("Second ");
		// t1.setPriority(100); //IllegalArgumentException
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();

		//timed waiting
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) {
		 * System.out.println(e.getMessage()); }
		 */

		//wait till t1 and t2 will finish 
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("----------------------------------------");

	}

}
