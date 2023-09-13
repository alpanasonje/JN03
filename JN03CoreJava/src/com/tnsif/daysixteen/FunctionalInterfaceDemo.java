package com.tnsif.daysixteen;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		Consumer<Integer> c = (n) -> System.out.println(n);
		c.accept(10);

		Consumer<String> c1 = (str) -> System.out.println("Welcome " + str);
		c1.accept("JN03 batch students");

		Supplier<String> s1=()->"Hello!!";
		System.out.println(s1.get());
		
		Supplier<Integer> s2=()->10;
		System.out.println(s2.get());
		
		Predicate<Integer> p1=(n)->n%2==0?true:false;
		System.out.println(p1.test(10));
		System.out.println(p1.test(5));
		
		Predicate<Integer> p2=(n)->n>=0?true:false;
		System.out.println(p2.test(-12));
		System.out.println(p2.test(2));
		
		Function<String, Integer> f1=(name)->name.length();
		System.out.println(f1.apply("Alpana"));
		
		BiFunction<Integer, Integer, Integer> f2=(n1,n2)->n1>n2?n1:n2;
		System.out.println(f2.apply(10, 60));
		System.out.println(f2.apply(100, 60));

	}

}
