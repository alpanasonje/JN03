//Program to define Employee class with getter and setters
package com.tnsif.daytwo;

import java.util.Date;

public class Employee {
	private int empId;
	private String name;
	private Date dateOfJoining;
	private float salary;
	private String deptName;
	
	//Getter and Setters
	public int getEmpId()
	{
		return empId;
	}
	
	public void setEmpId(int id)
	{
		empId=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name1) {
		name = name1;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
