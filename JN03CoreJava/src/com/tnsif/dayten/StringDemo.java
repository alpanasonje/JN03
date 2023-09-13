package com.tnsif.dayten;

public class StringDemo {

	public static void main(String[] args) {
		String s1=new String("Hello");
		System.out.println(s1+" : "+s1.hashCode());
		s1+="!, Hi";
		System.out.println(s1+" : "+s1.hashCode());
		
		
		String s2="Core Java";
		
		String s3=new String("Hello");
		
		String s4=new String("Hello");
		String s5=new String("Hello");
		System.out.println(s3+" : "+s3.hashCode());
		System.out.println(s2+" : "+s2.hashCode());
		System.out.println(s4+" : "+s4.hashCode());
		System.out.println(s5+" : "+s5.hashCode());
		String s6=new String("How are you?");
		System.out.println(s6+" : "+s6.hashCode());
}

}
