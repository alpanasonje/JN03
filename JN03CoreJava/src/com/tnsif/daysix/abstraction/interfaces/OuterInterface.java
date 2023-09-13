//Program to define nested interfaces
package com.tnsif.daysix.abstraction.interfaces;

public interface OuterInterface {
	int n=10;
	interface InnerInterface
	{
		int n=20;
		int n1=100;
		void show();
	}
	void display();
}
