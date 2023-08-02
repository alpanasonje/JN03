//Program to demonstrate java basics
package com.tnsif.dayone;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Welcome to the world of Java");
		System.out.println("-------------------");
		int a,b,c;
		a=100;
		b=100;
		c=a+b;
		System.out.println(c);
		System.out.println("Addition is "+c);
		
		for(int i=0;i<10;i++)
			System.out.print("Hello\t");
		
		if (a>b)
			System.out.println("\na is largest");
		else if (b>a)
			System.out.println("\nb is largest");
		else
			System.out.println("\nBoth are same");
	}
}
