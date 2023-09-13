package com.tnsif.dayeleven.lambdaexpression;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class EmployeeListDemo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(60, "Aniket", "IT", 78000));
		empList.add(new Employee(20, "Pankaj", "IT", 87000));
		empList.add(new Employee(10, "Neha", "Sales", 58000));
		empList.add(new Employee(40, "Priti", "HR", 60000));
		System.out.println(empList);
		
		empList.add(1,new Employee(30,"Sachin","Account",55000));
		System.out.println(empList);
		
		Comparator<Employee> comp=(e1,e2)->e1.getDept().compareTo(e2.getDept());
		Collections.sort(empList,comp); 
		System.out.println(empList);
		
		comp=(e1,e2)->(int)(e1.getSalary()-e2.getSalary());
		Collections.sort(empList,comp); 
		System.out.println(empList);
		
		comp=(e2,e1)->(int)(e1.getSalary()-e2.getSalary());
		Collections.sort(empList,comp); 
		System.out.println(empList);
		
		Stream<Integer> st=Stream.of(10,20,30);
		Function<Integer, Integer> sqr=(n)->n*n;
		Stream<Integer> strTwo= st.map(sqr);
		strTwo.forEach(System.out::println);
	}

}
