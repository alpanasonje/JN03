//Program to define class with final data member
package com.tnsif.daythree;

public class Circle {
	private  static final float PI;//=3.14f;
	private float radius;
	private float area;
	static
	{
		PI=3.14f;
	}
	public Circle() {
		//PI=4; can't reassign final variable
	}
	public Circle(float radius) {
		//PI=4; can't reassign final variable
		this.radius = radius;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public void calArea()
	{
		area=PI*radius*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + "]";
	}
	
	
}
