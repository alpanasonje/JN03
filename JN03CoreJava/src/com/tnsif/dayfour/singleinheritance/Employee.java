package com.tnsif.dayfour.singleinheritance;

public class Employee {
	private int empId;
	private String name;
	private float salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee(int empId, String name, float salary) {
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		System.out.println("Employee Parameterized Constructor");
	}

	public Employee() {
		System.out.println("Employee Default Constructor");
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

}
