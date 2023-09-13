package com.tnsif.dayfour.multilevelinheritance;

public class Student {
	private int uId;
	private String name;
	private String stream;
	private long contactNo;
	protected float score;
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
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public Student() {
		System.out.println("Student class default constructor");
	}
	public Student(int uId, String name, String stream, long contactNo) {
		super();
		this.uId = uId;
		this.name = name;
		this.stream = stream;
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Student [uId=" + uId + ", name=" + name + ", stream=" + stream + ", contactNo=" + contactNo + ", Score="+score+"]";
	}
	
	
}
