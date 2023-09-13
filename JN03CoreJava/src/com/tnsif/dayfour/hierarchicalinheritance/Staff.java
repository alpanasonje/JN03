package com.tnsif.dayfour.hierarchicalinheritance;

public class Staff {
	private String name;
	private long contactNo;
	private float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", contactNo=" + contactNo + ", salary=" + salary + "]";
	}
	
	
}
