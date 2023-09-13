package com.tnsif.daysix.abstraction.interfaces;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student("Manoj", 7878767670l);
		if (s1 instanceof Registrable)
			System.out.println("Student is enrolled for the course");
		else
			System.out.println("Student is not enrolled for the course");

	}

}
