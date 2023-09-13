package com.tnsif.dayten;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s1="Hello";
		System.out.println(s1.indexOf('e'));	
		System.out.println(s1.indexOf('l'));	
		
		System.out.println(s1.indexOf('l'));	
		
		System.out.println(s1.lastIndexOf('l'));	
		System.out.println(s1.indexOf('l'));	
		System.out.println(s1.indexOf('L'));	
		//System.out.println(	s1.charAt(10));
		System.out.println(("--------------------------"));
		System.out.println("s1 = "+s1);
		String s2=new String("hello");
		System.out.println("s2 = "+s2);
		System.out.println(s1.compareTo(s2));
		s1=s1.concat("Good Afternoon");
		System.out.println(s1);
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace("Hello", "Hi "));
		String str="Strings are sequence of characters. Strings are immutable.";
		System.out.println(str.replace("Strings", "**"));
		System.out.println(str.startsWith("Strings"));
		System.out.println(str.endsWith("."));
		String ss="    Hello   ";
		System.out.println("Your message is :"+ss+"!");
		System.out.println(ss.trim()+"!");
				
	}

}
