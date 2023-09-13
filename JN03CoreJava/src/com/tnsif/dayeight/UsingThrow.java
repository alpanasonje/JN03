package com.tnsif.dayeight;

public class UsingThrow {
	public static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println("\n-------------------");
	}
	public static void accept(int[] a)
	{
		for(int i=0;i<a.length;i++)
			a[i]=i+10;
	}
	public static void update(int[] a, int index, int value)
	{
		if(index<0 || index>=a.length)
			throw new ArrayIndexOutOfBoundsException(index);
		else
			a[index]=value;
	}
	public static int getArrayElement(int a[], int index) throws ArrayIndexOutOfBoundsException
	{
		if(index<0 || index>=a.length)
			throw new ArrayIndexOutOfBoundsException(index);
		else
			return a[index];
	}
}
