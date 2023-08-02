package com.tnsif.dayone;

public class StudentDemo {

	public static void main(String[] args) {
		Student s=new Student();
		s.accept(10, "Pratik", 70);
		s.display();
		
		Student s1=new Student();
		s1.accept(11,"Pranav", 60.83F);
		s1.display();
		
		Student s2=new Student();
		s2.accept(12, "Nikhil", 70);
		s2.display();
		
	}

}
