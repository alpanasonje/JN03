package com.tnsif.daynine.synchronization;

public class SyynchronizationDemo {
	static int n;
	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAccNo(101);
		acc.setName("Amol");
		acc.setBalance(20000);
		System.out.println(acc);
		AccountThread t1=new AccountThread(acc,6000);
		AccountThread t2=new AccountThread(acc,14000);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(acc);
		
			
	
		

	}

}
