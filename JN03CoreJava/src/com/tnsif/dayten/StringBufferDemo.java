package com.tnsif.dayten;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("Java Strings\n");
		sb.append("String in java : String is builtin class");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		String rev=sb.toString();
		System.out.println(rev);

	}

}
