package com.tnsif.daythirteen;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.add("Nashik");
		st.add("Delhi");
		st.add("Mumbai");
		st.add("Pune");
		st.add("Nagpur");
		System.out.println(st);
		System.out.println("topmost element of the stack : " + st.peek());
		System.out.println(st.pop() + " Removed successfully....");
		while (!st.isEmpty())
			System.out.println(st.pop() + " Removed successfully....");
	}
}
