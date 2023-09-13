package com.tnsif.daytwelve.map;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//sorted dictionary
		//null key not allowed
		//null values allowed
		/*
		 * TreeMap<String, String> tm1=new TreeMap<String, String>();
		 * tm1.put("komal@gmail.com","Pune"); tm1.put("purvi@gmail.com","Nashik");
		 * tm1.put("ankita@gmail.com","Pune"); tm1.put("urvi@gmail.com","Delhi");
		 * tm1.put("akshara@gmail.com","Nashik"); System.out.println(tm1);
		 * tm1.put("neha@gmail.com","Mumbai"); tm1.put("komal@gmail.com","Delhi");
		 * System.out.println(tm1); //tm1.put(null,"Mumbai"); //NullPointerException
		 * tm1.put("namita@gmail.com",null); System.out.println(tm1);
		 */
		
		Comparator<Employee> comp;
		//comp=(e2,e1)->e1.getEmpId()-e2.getEmpId();
		comp=(e1,e2)->e1.getDept().compareTo(e2.getDept());		
		TreeMap<Employee, String> tm2=new TreeMap<Employee, String>(comp);
		tm2.put(new Employee(12,"Abhishek", "IT", 45000), "Pune");
		tm2.put(new Employee(16,"Bharat", "Sales", 48000), "Mumbai");
		tm2.put(new Employee(13,"Krishna", "HR", 55000), "Delhi");
		tm2.put(new Employee(11,"Manoj", "Account", 85000), "Pune");
		System.out.println(tm2);
		
		Set<Employee> s=tm2.keySet();
		Iterator<Employee> it=s.iterator();
		while(it.hasNext())
		{
			Employee key=it.next();
			String city=tm2.get(key);
			System.out.println(key.getName() +" : "+city);
		}
	}

}
