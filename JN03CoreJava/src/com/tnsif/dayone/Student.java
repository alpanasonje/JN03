package com.tnsif.dayone;

public class Student {
	//default access specifier - package specific
	int rollNo;
	String studentName;
	float per;
	
	public void accept(int rno, String name, float p)
	{
		rollNo=rno;
		studentName=name;
		per=p;
	}
	
	public void display()
	{
		System.out.println("Student Details are as follows");
		System.out.println("Roll Number : "+rollNo+" Name : "+studentName+" Percentage : "+per);
	}

}
