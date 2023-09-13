package com.tnsif.dayfour.hierarchicalinheritance;

public class Adhoc extends Staff {
	private String contract_Period;

	public String getContract_Period() {
		return contract_Period;
	}

	public void setContract_Period(String contract_Period) {
		this.contract_Period = contract_Period;
	}

	@Override
	public String toString() {
		return "Adhoc ["+super.toString()+contract_Period + "]";
	}
	
	
}
