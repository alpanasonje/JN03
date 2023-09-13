//Program to demonstrate generic interface
package com.tnsif.dayfifteen.generics;

//Generic Class implements Generic Interface (MinMax)
public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
	T[] values;

	// Generic Constructor
	MinMaxImpl(T[] obj) {
		values = obj;
	}

	// Generic method
	@Override
	public T min() {
		T minValue = values[0];

		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(minValue) < 0)
				minValue = values[i];
		return minValue;
	}

	// Generic method
	@Override
	public T max() {
		T o1 = values[0];
		for (int i = 1; i < values.length; i++)
			if (values[i].compareTo(o1) > 0)
				o1 = values[i];
		return o1;
	}
}