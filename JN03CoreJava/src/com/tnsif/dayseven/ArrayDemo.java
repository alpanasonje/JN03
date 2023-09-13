package com.tnsif.dayseven;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] a,b;   //int a[],b;
		a=new int[5];
		b=new int[3];
		//index loop
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		
		System.out.println("------------------------------");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+"\t");
		
		//for..each loop
		for(int ele:a)
			System.out.println(ele);
		
		char ch[]= {'a','b','c','d'};
		String[] cities= {"Mumbai", "Pune", "Delhi"};
		
		for(char c:ch)
			System.out.print(c+" ");
		
		for(String city:cities)
			System.out.print(city+"  ");
		
		for(int i=0;i<=a.length;i++)
			a[i]=i*10;
		
		for(int ele:a)
			System.out.print(ele+"\t");
		
		System.out.println("--------END OF MAIN-------");
	}

}
