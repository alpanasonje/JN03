package com.tnsif.daynine;

public class RunnableDemo {

	public static void main(String[] args) {
		//using implementable class
		Runnable r=new RunnableThread();
		Thread t1=new Thread(r);
		
		
		//using anonymous class
		Runnable r1= new Runnable() {
			public void run() {
				for (int i=2;i<=10;i+=2)
					System.out.print(Thread.currentThread().getName()+i+", ");
			}
		};
		Thread t2=new Thread(r1);
	
		//using Lambda Expression
		Runnable r2=()->{for (int i=1;i<=10;i++)
			System.out.print(Thread.currentThread().getName()+i+", ");};
		
		Thread t3=new Thread(r2);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
