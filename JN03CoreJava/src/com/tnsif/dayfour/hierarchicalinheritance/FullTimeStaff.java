package com.tnsif.dayfour.hierarchicalinheritance;

public class FullTimeStaff extends Staff {
	private String incrementPolicy;

	public String getIncrementPolicy() {
		return incrementPolicy;
	}

	public void setIncrementPolicy(String incrementPolicy) {
		this.incrementPolicy = incrementPolicy;
	}

	@Override
	public String toString() {
		return "FullTimeStaff "+super.toString()+", incrementPolicy=" + incrementPolicy + "]";
	}
	
}
