package com.tnsif.dayeight;
import java.util.*;
public class UsingFinallyBlock {

	public static void main(String[] args) {
		Scanner sc=null;
		int n;
		try
		{
			System.out.println("-------------In try-------------");
			sc=new Scanner(System.in);
			System.out.println("Enter the Number : ");
			n=sc.nextInt();
			System.out.println("You entered : "+n);
		}
		catch(InputMismatchException e)
		{
			System.out.println("-------------In catch-------------");
			System.out.println("Invalid Input");
		}
		finally
		{
			System.out.println("-------------In finally-------------");
			sc.close();
		}

	}

}
