package com.tnsif.dayfour.hasarelationship;

public class Executor {

	public static void main(String[] args) {
		Department d=new Department();
		d.setDeptNo(10);
		d.setDeptName("Computer");
		d.setNoOfEmployees(8);
		d.setDeptHead("Wankhede N");
		
		Employee e=new Employee();
		e.setEmpId(101);
		e.setEmpName("Wankhede N");
		e.setSalary(148000);
		e.setDept(d);
		
		Employee e1=new Employee();
		e1.setEmpId(102);
		e1.setEmpName("Pawar J");
		e1.setSalary(78000);
		e1.setDept(d);
		
		System.out.println(e);
		System.out.println(e1);
		
		

	}

}
