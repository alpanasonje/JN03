package com.tnsif.daysix.abstraction.interfaces;

public class Executor {

	public static void main(String[] args) {
		//creating object of implementable class and referencing through interface variable 
		FirstInterface f=new FirstInterfaceImpl();
		f.show();
		f.display();
		System.out.println(f.message);
		
		//Anonymous class
		FirstInterface f1=new FirstInterface() {
			@Override
			public void show() {
				System.out.println("Good Evening "+message);
			}
			
			@Override
			public void display() {
				System.out.println("Hello "+message+" How are you?");
			}
		};
		f1.show();
		f1.display();
		
		ChildInterface c1=new ChildInterface() {
			
			@Override
			public void show() {
				System.out.println("Overrides show() method of FirstInterface");
				
			}
			
			@Override
			public void display() {
				System.out.println("Overrides display() method of FirstInterface");
				
			}
			
			@Override
			public String greet(String name) {
				
				return "Good Evening "+name;
			}
		};
		c1.show();
		c1.display();
		System.out.println(c1.greet("Students"));
		
		OuterInterface o1=new OuterInterface() {
			
			@Override
			public void display() {
				System.out.println(n);
				System.out.println(InnerInterface.n);
				
			}
		};
		
		o1.display();
	}

}
