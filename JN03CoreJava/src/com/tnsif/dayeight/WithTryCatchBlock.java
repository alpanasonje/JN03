package com.tnsif.dayeight;

public class WithTryCatchBlock {
	
	public static int division(int a, int b) {
		int c=0;
		try {
			c=a / b;
		} catch (ArithmeticException ae) {
			System.out.println("Error Occurred... " +ae);
		}
		return c;
	}

	public static float floatDivision(int a, int b) {
		return (float) a / b;
	}
}
