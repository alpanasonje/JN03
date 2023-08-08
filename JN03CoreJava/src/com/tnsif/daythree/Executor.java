package com.tnsif.daythree;

public class Executor {

	public static void main(String[] args) {
		
		System.out.println(Student.getCollegeName());
	
	
		Student s1=new Student(1,"Pratiksha",67);
		Student s2=new Student(2,"Pranali",71);
		Student.setCollegeName("SKH");
		Student s3=new Student(3,"Apeksha",78);
		Student s4=new Student(4,"Pratik",87);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("---------------------------------");
		Circle c=new Circle(4);
		c.calArea();
		System.out.println(c);
		
		Circle c1=new Circle();
		c1.setRadius(5);
		c1.calArea();
		System.out.println(c1);
		
		//final local variable
		final int cnt;//=20; 
		cnt=10;
		System.out.println(cnt);

		//cnt++;
		
		Base b1=new Base();
		b1.greet();
		b1.show();
		
		Derived d1=new Derived();
		d1.greet();
		d1.show();
	}

}
