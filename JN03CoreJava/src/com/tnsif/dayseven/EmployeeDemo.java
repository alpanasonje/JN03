package com.tnsif.dayseven;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee[] e=new Employee[5];
		e[0]=new Employee(101, "Pooja",76000);
		e[1]=new Employee(102, "Pratiksha",65000);
		
		for(int i=0;i<e.length;i++)
			System.out.println(e[i]);

	}

}
