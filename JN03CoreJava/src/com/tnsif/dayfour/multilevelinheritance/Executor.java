package com.tnsif.dayfour.multilevelinheritance;

public class Executor {

	public static void main(String[] args) {
		StudentResult r=new StudentResult();
		r.setuId(10);
		r.setName("Shubham");
		r.setContactNo(8664577650l);
		r.setStream("E&TC");
		r.setsPrint1(78);
		r.setsPrint2(81);
		r.settQuizzes(77);
		r.setsQuizzes(79);
		r.setFinalTest(75);
		r.calculateScore();
		System.out.println(r);
	}

}
