package com.tnsif.dayeight;

public class WithoutExceptionHandling {

	public static void main(String[] args) {
		int a,b;
		float c;
		int d;
		a=12;
		b=0;
		//float division by 0 returns Infinity
		c=(float)a/b;
		System.out.println("Float Division is "+c);
		
		//integer division by 0 raise Arithmetic Exception
		d=a/b;
		System.out.println("Integer Division is "+d);
		
		System.out.println("----------------------------------------");
	}

}
