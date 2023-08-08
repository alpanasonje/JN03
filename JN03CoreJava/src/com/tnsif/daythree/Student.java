//Program to define class with static data member, static block and static methods
package com.tnsif.daythree;

public class Student {
	private int id;
	private String name;
	private float per;
	// static variable
	private static String collegeName;

	// static block use to initialize static data memebrs
	// It is executed before any object creation
	static {
		collegeName = "SKH, Nashik";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	// static methods
	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
		// this.collegeName=collegeName;
		// this keyword not allowed in static context
		// rollNo=10;
		// instance members not allowed in static context
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + ", collegeName=" + collegeName + "]";
	}

}
