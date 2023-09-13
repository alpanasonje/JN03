package com.tnsif.daynine.synchronization;

public class Account implements Bank {
	private int accNo;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	private String name;
	private int balance;

	@Override
	//public synchronized void deposit(int amount) {
	public void deposit(int amount) {
		if (amount>DEPOSIT_LIMIT)
				System.out.println("Deposit limit exceeded");
		else
			balance += amount;

	}

	@Override
	//public synchronized void withdraw(int amount) {
	public  void withdraw(int amount) {
		if (amount>balance-MINIMUM_BALANCE)
			System.out.println("Insufficient balance...");
		else
			balance -= amount;

	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

}
