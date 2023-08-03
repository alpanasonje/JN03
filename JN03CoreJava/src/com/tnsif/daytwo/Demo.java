//Program to demonstrate constructor overloading and getter and setters
package com.tnsif.daytwo;

import java.util.Date;

import com.tnsif.dayone.Student;
public class Demo {

	public static void main(String[] args) {
		/*
		 * Student s=new Student(); s.accept(111, "Aniket", 80); s.display();
		 */
		
		//default constructor
		Product p=new Product();
		p.show();
		
		//parameterized constructor
		Product p1=new Product(102,"Notebook",230,10);
		p1.show();
		
		Product p2=new Product(103, "Pen", 100, 20);
		p2.show();
		
		
		Employee e1=new Employee();
		//Using setters store values into private data members
		e1.setEmpId(1001);
		e1.setName("Ankit"); 
		e1.setSalary(67000); 
		e1.setDeptName("IT"); 
		e1.setDateOfJoining(new Date());
		
		//Using getters accessing values of private data members
		System.out.println("Employee Details Employee ID : "+e1.getEmpId()+"\tName : "+e1.getName()+"\tSalary : "+e1.getSalary()+"\tDate of Joining : "+e1.getDateOfJoining()+"\tDepartment : "+e1.getDeptName());
	}

}
