package com.tnsif.dayeight;

public class Student {
	private int rollNo;
	private String name;
	private float per;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	//raising and declaring user defined exception
	public void setPer(float per) throws InvalidPercentageException { //declaring exception
		if (per<0 || per>100)
			throw new InvalidPercentageException(); //raising exception
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}

	
}
