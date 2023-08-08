package com.tnsif.dayfour.singleinheritance;

public class Manager extends Employee {
	private int teamSize;
	private String taskAllocation;
	private String rights;
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getTaskAllocation() {
		return taskAllocation;
	}
	public void setTaskAllocation(String taskAllocation) {
		this.taskAllocation = taskAllocation;
	}
	public String getRights() {
		return rights;
	}
	public void setRights(String rights) {
		this.rights = rights;
	}
	public Manager() {
		System.out.println("Manager Default Constructor");
	}
	public Manager(int empId, String name, float salary, int teamSize, String taskAllocation, String rights) {
		super(empId, name, salary);
		this.teamSize=teamSize;
		this.taskAllocation=taskAllocation;
		this.rights=rights;	
		System.out.println("Manager Parameterized Constructor");
	}
	@Override
	public String toString() {
		return "Manager ["+super.toString()+", Team Size = " + teamSize + ", taskAllocation=" + taskAllocation + ", rights=" + rights + "]";
	}
	
	
}
