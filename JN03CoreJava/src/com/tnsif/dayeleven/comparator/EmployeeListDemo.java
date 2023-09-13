package com.tnsif.dayeleven.comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class EmployeeListDemo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(60, "Aniket", "IT", 78000));
		empList.add(new Employee(20, "Pankaj", "IT", 87000));
		empList.add(new Employee(10, "Neha", "Sales", 58000));
		empList.add(new Employee(40, "Priti", "HR", 60000));
		System.out.println(empList);
		
		empList.add(1,new Employee(30,"Sachin","Account",55000));
		System.out.println(empList);
		
		Comparator<Employee> comp=new SortByDept();
		Collections.sort(empList,comp); 
		System.out.println(empList);
		
		comp=new SortByName();
		Collections.sort(empList,comp); 
		System.out.println(empList);
	}

}
