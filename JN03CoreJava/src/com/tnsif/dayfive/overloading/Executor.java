//Program to demonstrate method overloading
package com.tnsif.dayfive.overloading;

public class Executor {

	public static void main(String[] args) {
		Operations.add();
		System.out.println(Operations.add(10, 20));
		System.out.println(Operations.add(10, 20.50f));
		System.out.println(Operations.add(10.5f, 20));
		System.out.println(Operations.add("Java", " Programming"));
	}

}
