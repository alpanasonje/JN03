package com.tnsif.dayeight;

import java.io.*;

public class UsingMultipleCatchBlock {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers : ");
		int a, b;
		try {
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			Operations.division(a, b);

		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println("Error : " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}

		catch (Exception e) {
			System.out.println("Error Occurred... : " + e.getMessage());
		}
	}

}
