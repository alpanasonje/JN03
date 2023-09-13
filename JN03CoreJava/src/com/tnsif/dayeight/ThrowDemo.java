package com.tnsif.dayeight;

public class ThrowDemo {

	public static void main(String[] args) {
		int a[] = new int[5];
		UsingThrow.accept(a);
		UsingThrow.display(a);
		try {
			UsingThrow.update(a, 1, 200);
			UsingThrow.display(a);
			System.out.println(UsingThrow.getArrayElement(a, 7));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception raised " + e.getMessage());
		}
		
		
	}

}
