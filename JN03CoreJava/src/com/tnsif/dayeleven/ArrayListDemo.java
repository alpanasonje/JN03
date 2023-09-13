package com.tnsif.dayeleven;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List rawList=new ArrayList();
		System.out.println(rawList);
		rawList.add(10);
		rawList.add(20);
		rawList.add("Nashik");
		rawList.add("Pune");
		rawList.add(false);
		rawList.add(true);
		rawList.add("Nashik");
		rawList.add(20);
		rawList.add(23.78f);
		System.out.println(rawList);
		System.out.println(rawList.contains("Pune"));
		System.out.println(rawList.indexOf("Nashik"));
		System.out.println(rawList.lastIndexOf("Nashik"));
		System.out.println(rawList.get(2));
		System.out.println(rawList.indexOf("Nashik"));
		rawList.add(1, 45.20f);
		System.out.println(rawList);
		System.out.println("-----------------------------------");
		System.out.println(rawList.remove(3));
		System.out.println(rawList);
		//System.out.println(rawList.remove(20)); IndexOutOfBoundsException
		System.out.println(rawList.remove(rawList.indexOf(20)));
		System.out.println(rawList);
		System.out.println(rawList.remove(false));
		System.out.println(rawList);
		System.out.println(rawList.remove("Delhi"));
		System.out.println(rawList);
		
		Collections.sort(rawList); //ClassCastException
		System.out.println(rawList);
	}

}
