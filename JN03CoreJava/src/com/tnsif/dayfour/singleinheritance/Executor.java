package com.tnsif.dayfour.singleinheritance;

public class Executor {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"Ankit", 67000);
		System.out.println(e1);
		
		Manager m1=new Manager();
		m1.setEmpId(201);
		m1.setName("Dhruv");
		m1.setSalary(120000);
		m1.setTeamSize(8);
		m1.setTaskAllocation("Assigning Projects");
		m1.setRights("Sanctioning Leave");
		System.out.println(m1);
		
		Manager m2=new Manager(202,"Meet",90000,4,"scheduling task","rating the employees");
		System.out.println(m2);

	}

}
