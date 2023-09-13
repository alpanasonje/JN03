package com.tnsif.daysix.abstraction.interfaces;

public interface Bank {
	int MINIMUM_BALANCE = 1000;
	int DEPOSIT_LIMIT = 25000;
	float INTEREST_RATE = 7.8f;
	String bankName="SBI";
	
	void withdraw(int amount, Account account);

	void deposit(int amount, Account account);

}
