package com.tnsif.dayfour.multilevelinheritance;

public class StudentAssessment extends Student{
	private float tQuizzes;
	private float sQuizzes;
	private float sPrint1;
	private float sPrint2;
	private float finalTest;
	public float gettQuizzes() {
		return tQuizzes;
	}
	public void settQuizzes(float tQuizzes) {
		this.tQuizzes = tQuizzes;
	}
	public float getsQuizzes() {
		return sQuizzes;
	}
	public void setsQuizzes(float sQuizzes) {
		this.sQuizzes = sQuizzes;
	}
	public float getsPrint1() {
		return sPrint1;
	}
	public void setsPrint1(float sPrint1) {
		this.sPrint1 = sPrint1;
	}
	public float getsPrint2() {
		return sPrint2;
	}
	public void setsPrint2(float sPrint2) {
		this.sPrint2 = sPrint2;
	}
	
	
	public float getFinalTest() {
		return finalTest;
	}
	public void setFinalTest(float finalTest) {
		this.finalTest = finalTest;
	}
	public StudentAssessment() {
		System.out.println("StudentAssessment class default constructor");
		
	}
	public StudentAssessment(int uId, String name, String stream, long contactNo,float tQuizzes, float sQuizzes, float sPrint1, float sPrint2 , float finalTest) {
		super(uId, name, stream, contactNo);
		this.tQuizzes=tQuizzes;
		this.sQuizzes=sQuizzes;
		this.sPrint1=sPrint1;
		this.sPrint2=sPrint2;
		this.finalTest=finalTest;
	}
	@Override
	public String toString() {
		return "StudentAssessment [tQuizzes=" + tQuizzes + ", sQuizzes=" + sQuizzes + ", sPrint1=" + sPrint1
				+ ", sPrint2=" + sPrint2 + ", Final Test="+finalTest+", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
