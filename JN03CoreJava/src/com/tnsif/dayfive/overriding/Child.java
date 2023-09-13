package com.tnsif.dayfive.overriding;

public class Child extends Base {
	@Override
	public void show()
	{
		System.out.println("Show() in child class");		
	}
	//@Override
	static void display()
	{
		System.out.println("Static display() in Child");
	}
}
