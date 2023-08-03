//Program to define a class with constructor overloading
package com.tnsif.daytwo;

public class Product {
	private int productId;
	private String productName;
	private float price;
	private int qty;
	
	//Constructor Overloading
	//Constructor
	public Product()
	{
		System.out.println("default constructor");
		productId=101;
		productName="Book";
		price=650;
		qty=5;
	}
	
	//Parameterized constructor
	public Product(int pno, String name, float rate, int q)
	{
		productId=pno;
		productName=name;
		price=rate;
		qty=q;
	}
	
	public void show()
	{
		System.out.println("Product Details");
		System.out.println("Product Id : "+productId+"\tName : "+productName+"\tPrice : "+price+"\tQuantity : "+qty+"\tAmount : "+price*qty);
	}
}
