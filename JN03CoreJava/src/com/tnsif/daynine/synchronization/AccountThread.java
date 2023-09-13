package com.tnsif.daynine.synchronization;

public class AccountThread extends Thread {
	Account acc;
	int amount;
	public AccountThread(Account acc, int amount) {
		this.acc=acc;
		this.amount=amount;
	}

	@Override
	public void run() {
	synchronized (acc) {
		//acc.deposit(amount);
		acc.withdraw(amount);
	}
		
	}
}
