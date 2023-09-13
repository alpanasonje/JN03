package com.tnsif.daytwelve.map;

import java.util.Collections;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//Key - emailid , value - employee details
		//unordered, unsorted dictionary
		//allows null key as well as value
		//allows unique keys
		HashMap<String, Employee> hm=new HashMap<String, Employee>();
		hm.put("asonje@tnsif.org", new Employee(101,"Alpana","IT",67800));
		hm.put("abc@gmail.com", new Employee(105,"abc","HR",71800));
		hm.put("xyz@tnsif.org", new Employee(109,"xyz","Sales",34800));
		hm.put("lmn@gmail.com", new Employee(102,"lmn","IT",88800));
		hm.put(null, null);
		hm.put("xyz@tnsif.org", new Employee(111,"x","Sales",34800));
		System.out.println(hm);
		hm.remove(null);
		System.out.println(hm);
	//	Collections.sort(hm);
		
		
		
		
	}

}
