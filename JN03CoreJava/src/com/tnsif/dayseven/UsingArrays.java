//Program to demonstrate Arrays class 
package com.tnsif.dayseven;

import java.util.Arrays;

public class UsingArrays {

	public static void main(String[] args) {
		int a[]= {12,65,78,35};
		for(int ele:a)
			System.out.print(ele+"\t");
		Arrays.sort(a);
		System.out.println("\nAfter Sorting");
		for(int ele:a)
			System.out.print(ele+"\t");
		
		int index=Arrays.binarySearch(a, 35);
		System.out.println("\n"+index);
		
		Arrays.fill(a, 99);
		for(int ele:a)
			System.out.print(ele+"\t");
		
		int b[]= {99,99,99,99};
		for(int ele:b)
			System.out.print(ele+"\t");
		
		if (a.equals(b))
			System.out.println("A and B arrays are same");
		else
			System.out.println("A and B arrays are not same");
		
		b[2]=100;
		for(int ele:a)
			System.out.print(ele+"\t");
			
		System.out.println(Arrays.compare(a, b));
		
		
		
	}

}
