package com.tnsif.dayfour.hasarelationship;

public class Department {
	private int deptNo;
	private String deptName;
	private String deptHead;
	private int noOfEmployees;
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptHead() {
		return deptHead;
	}
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", deptHead=" + deptHead + ", noOfEmployees="
				+ noOfEmployees + "]";
	}
	
	
}
