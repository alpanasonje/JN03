//Program to demonstrate generic method
package com.tnsif.dayfifteen.generics;

public class GenericMethod {
	//Generic Method
		public <E> void displayArrayElements(E[] elements) {
			for (E element : elements) {
				System.out.println("element is: " + element);
			}
		}
}
