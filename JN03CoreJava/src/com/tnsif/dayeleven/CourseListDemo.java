package com.tnsif.dayeleven;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CourseListDemo {

	public static void main(String[] args) {
		List<String> courseList=new ArrayList<String>();
		courseList.add("C");
		courseList.add("Java");
		courseList.add("C++");
		courseList.add("Python");
		//courseList.add(true); CTE
		
		System.out.println(courseList);
		courseList.add(1,"DSA");
		System.out.println(courseList);
		
		Collections.sort(courseList);
		System.out.println(courseList);

		Iterator<String> it=courseList.iterator();
		while(it.hasNext())
		{
			String course=it.next();
			System.out.println(course.toUpperCase());
			if (course.equals("C++"))
				it.remove();
		}
		System.out.println(courseList);
	}

}
