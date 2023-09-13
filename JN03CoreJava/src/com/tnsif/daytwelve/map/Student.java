package com.tnsif.daytwelve.map;

public class Student {
	private int uId;
	private String name;

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		System.out.println("Student class default constructor");
	}

	public Student(int uId, String name) {
		super();
		this.uId = uId;
		this.name = name;

	}
	
	@Override
	public boolean equals(Object s)
	{
		Student st=(Student)s;
		if (uId==st.uId && name==st.name)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode()
	{
		return uId+name.hashCode();
	}
	@Override
	public String toString() {
		return "Student [uId=" + uId + ", name=" + name + "]";
	}

}
