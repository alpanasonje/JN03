//Program to demonstrate Object creation 
package com.tnsif.daytwo;

public class PointDemo {

	public static void main(String[] args) {
		Point p1 = new Point();

		Point p2 = new Point(12.5f, 20);

		Point p3 = new Point();
		p3.setX(10);

		Point p4 = new Point();
		p4.setY(20);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}

}
