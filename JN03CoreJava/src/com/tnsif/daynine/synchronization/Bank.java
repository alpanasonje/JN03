package com.tnsif.daynine.synchronization;

public interface Bank {
	int MINIMUM_BALANCE=2000;
	int DEPOSIT_LIMIT=50000;
	void deposit(int amount);
	void withdraw(int amount);
}
