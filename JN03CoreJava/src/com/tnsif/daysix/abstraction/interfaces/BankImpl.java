package com.tnsif.daysix.abstraction.interfaces;

public class BankImpl implements Bank{

	
	@Override
	public void withdraw(int amount, Account account) {
		float bal;
		bal=account.getBalance()-amount;
		if (bal<MINIMUM_BALANCE)
			System.out.println("Unable to withdraw, insufficient balance");
		else
			account.setBalance(account.getBalance()-amount);
		
	}

	@Override
	public void deposit(int amount, Account account) {
		if (amount > DEPOSIT_LIMIT)
			System.out.println("Unable to deposit, Daily Limit exceeds ");
		else
			account.setBalance(account.getBalance()+amount);
		
	}

}
