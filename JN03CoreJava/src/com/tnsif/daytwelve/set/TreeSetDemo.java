package com.tnsif.daytwelve.set;

import java.util.Comparator;
import java.util.TreeSet;
import com.tnsif.daytwelve.map.Student;
public class TreeSetDemo {

	public static void main(String[] args) {
		//sorted set
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(5);
		ts.add(20);
		//ts.add(5.6f); //ClassCastException
		System.out.println(ts);
		
		TreeSet<String> nameSet =new TreeSet<String>();
		nameSet.add("Nitin");
		nameSet.add("Sarvesh");
		nameSet.add("Venkatesh");
		nameSet.add("Dhanesh");
		nameSet.add("Sanket");
	//	nameSet.add(null); NullPointerException
		//nameSet.add(12); CTE
		
		System.out.println(nameSet);
		//TreeSet<Student> studentSet=new TreeSet<Student>();
		//at the time of first add() throws ClassCastException
		
		//Lambda Expression
		Comparator<Student> comp=(s1,s2)->s1.getuId()-s2.getuId();
		Comparator<Student> comp1=(s2,s1)->s1.getuId()-s2.getuId();
		Comparator<Student> comp2=(s1,s2)->s1.getName().compareTo(s2.getName());
		Comparator<Student> comp3=(s2,s1)->s1.getName().compareTo(s2.getName());
		
		TreeSet<Student> studentSet=new TreeSet<Student>(comp3);
		studentSet.add(new Student(101, "Mayuresh"));
		studentSet.add(new Student(106, "Harshad"));
		studentSet.add(new Student(102, "Saurabh"));
		studentSet.add(new Student(108, "Alish"));
		studentSet.add(new Student(111, "Vaibhav"));
		studentSet.add(new Student(100, "Sahil"));
		studentSet.add(new Student(103, "Harshdeep"));
		
		System.out.println(studentSet);		

	}

}
