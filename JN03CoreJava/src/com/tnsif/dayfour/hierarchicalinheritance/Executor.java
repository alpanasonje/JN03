package com.tnsif.dayfour.hierarchicalinheritance;

public class Executor {

	public static void main(String[] args) {
		FullTimeStaff f=new FullTimeStaff();
		f.setName("Ankit");
		f.setContactNo(9898776655l);
		f.setSalary(98000);
		f.setIncrementPolicy("Policy based on performance");
		System.out.println(f);
		
		Adhoc a=new Adhoc();
		a.setName("Ankita");
		a.setContactNo(9098776655l);
		a.setSalary(45000);
		a.setContract_Period("1 Year");
		System.out.println(a);
		
		
		Staff s;
		s=f;
		System.out.println(s); //toString() of FullTimeStaff
		
		s=a;
		System.out.println(s); //toString() Adhoc staff
		
		
	}

}
