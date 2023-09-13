package com.tnsif.dayfive.overriding;

public class Executor {

	public static void main(String[] args) {
		Base b1=new Base();
		b1.show();
		Base.display();
		
		Child c1=new Child();
		c1.show();
		Child.display();

		System.out.println("------------------------");
		Base b;
		b=b1;
		b.show();
		Base.display();
		
		b=c1;
		b.show();
		Base.display();
		
	}

}
