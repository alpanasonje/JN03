package com.tnsif.daysix.abstraction.interfaces;

public class BankDemo {

	public static void main(String[] args) {
		BankImpl bimpl=new BankImpl();
		Account a=new Account();
		a.setAccNo(10101);
		a.setBank(bimpl);
		a.setName("Abhijeet");
		a.setBalance(10000);
		System.out.println(a);
		bimpl.deposit(5000, a);
		System.out.println(a);
		bimpl.withdraw(7000, a);
		System.out.println(a);

	}

}
