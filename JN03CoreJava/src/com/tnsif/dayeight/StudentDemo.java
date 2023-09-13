package com.tnsif.dayeight;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRollNo(1);
		s1.setName("Aditya");
		
		try {
			s1.setPer(78);
		} catch (InvalidPercentageException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(s1);
		Student s2=new Student();
		s2.setRollNo(2);
		s2.setName("Aditi");
		try {
			s2.setPer(780);
		} catch (InvalidPercentageException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(s2);
	}

}
