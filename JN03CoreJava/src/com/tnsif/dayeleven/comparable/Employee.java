package com.tnsif.dayeleven.comparable;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String name;
	private String dept;
	private float salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, String dept, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

	// Sort by EmpId
	/*
	 * @Override public int compareTo(Employee o) {
	 * 
	 * return this.empId-o.empId; }
	 */

	// Sort by Salary
	/*
	 * @Override public int compareTo(Employee o) {
	 * 
	 * return (int) (this.salary-o.salary); }
	 */

	// Sort by name
	@Override
	public int compareTo(Employee o) {

		return this.name.compareTo(o.name);
	}
}
