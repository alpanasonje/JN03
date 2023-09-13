package com.tnsif.dayeleven.comparator;

import java.util.Comparator;

public class SortByName implements Comparator<Employee>{

	//Descending order of name
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getName().compareTo(o1.getName());
	}

}
