package com.tnsif.daythirteen;

import java.util.Comparator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>(2);
		System.out.println("Size : "+v.size()+"Initial Capacity " +v.capacity());
		v.add(10);
		v.add(40);
		v.add(60);
		System.out.println("Size : "+v.size()+"Current Capacity : "+v.capacity());
		v.add(20);
		System.out.println(v);
		System.out.println("Size : "+v.size()+"Current Capacity : "+v.capacity());
		v.add(50);
		System.out.println("Size : "+v.size()+"Current Capacity : "+v.capacity());
		System.out.println("Before Sorting : "+v);
		Comparator<Integer> c=(n2,n1)->n1-n2;
		v.sort(c);
		System.out.println("After Sorting : "+v);
	}

}
