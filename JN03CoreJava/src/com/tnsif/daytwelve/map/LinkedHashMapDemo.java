package com.tnsif.daytwelve.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		//ordered, unsorted dictionary
		LinkedHashMap<Student, String> lhm =new LinkedHashMap<Student, String>();
		lhm.put(null, null);
		lhm.put(new Student(105,"Pooja"), "Nagpur");
		lhm.put(new Student(109,"Neha"), "Nashik");
		lhm.put(new Student(102,"Megha"), "Bangalore");
		lhm.put(new Student(101,"Deepa"), "Mumbai");
		lhm.put(new Student(102,"Meena"), "Pune");
		lhm.put(new Student(102,"Meena"), "Chennai");
		lhm.put(new Student(111,"Neeta"), "Delhi");
		
		System.out.println(lhm);
		
		Set<Student> s=lhm.keySet();
		Iterator<Student> i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("------------------------------");
		LinkedHashMap<Integer, String> lhm1=new LinkedHashMap<>();
		lhm1.put(1, "abc");
		lhm1.put(5, "xyz");
		lhm1.put(4, "lmn");
		lhm1.put(1, "ijk");
		lhm1.put(8, "pqr");
		
		System.out.println(lhm1);
		
		
	}

}
