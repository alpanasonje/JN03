//Program to define class with Covariant Method Overriding 
package com.tnsif.dayfive.overriding.covariant;

//Student class
class Student implements Cloneable {
	int rollNo;
	String className;
	String name;

	// Getters and setters
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Class constructor
	public Student(int rollNo, String className, String name) {
		this.rollNo = rollNo;
		this.className = className;
		this.name = name;
	}

	// Print method
	public void printData() {
		System.out.println("Name : " + name + ", RollNo: " + rollNo + ", Class Name : " + className);
	}

	// Override the clone method
	/*
	 * @Override public Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */

	// Override the clone method - Covariant overriding

	
	  @Override public Student clone() throws CloneNotSupportedException { return
	  (Student) super.clone(); }
	 

}
