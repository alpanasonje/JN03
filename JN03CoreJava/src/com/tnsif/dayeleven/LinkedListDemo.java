package com.tnsif.dayeleven;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// Ordered Collection
		LinkedList<String> nameList = new LinkedList<String>();
		nameList.add("Nikita");
		nameList.add("Mayuri");
		nameList.add("Vaishnavi");
		nameList.add("Sayli");
		nameList.add("Vedanti");
		// nameList.add(13);
		System.out.println(nameList);

		nameList.addFirst("Damini");
		nameList.addLast("Shalini");
		nameList.add(3, "Kajal");
		System.out.println(nameList);

		System.out.println("Element at 5th index : " + nameList.get(5));
		System.out.println("First Element : " + nameList.getFirst());
		System.out.println("Last Element : " + nameList.getLast());

		nameList.remove();
		System.out.println(nameList);

		// nameList.remove(112); IndexOutOfBoundsException
		nameList.remove(2);
		System.out.println(nameList);

		nameList.remove("Vaishnavi");
		System.out.println(nameList);

		nameList.removeFirst();
		nameList.removeLast();
		System.out.println(nameList);

		System.out.println("------------------------------------");

		LinkedList<Integer> numList = new LinkedList<Integer>();
		numList.add(10);
		numList.add(6);
		numList.add(1);
		numList.add(7);
		numList.add(3);
		System.out.println(numList);

		// moving forward direction only and can remove the element
		Iterator<Integer> it = numList.iterator();
		while (it.hasNext()) {
			int no = it.next();
			if (no == 1)
				it.remove();
			if (no % 2 == 1)
				System.out.println(no + " : " + no * no);
			else
				System.out.println(no + " : " + no * no * no);
		}
		// it.next(); NoSuchElementException
		System.out.println(numList);

		//Moves in both directions 
		
		ListIterator<Integer> lit = numList.listIterator();
		System.out.println("Next Index : " + lit.nextIndex());
		//Forward direction
		while (lit.hasNext())
			System.out.println(lit.next());

		System.out.println("------------------------");
		//Backward direction
		lit = numList.listIterator(numList.size());
		while (lit.hasPrevious())
		{
			int no=lit.previous();
			System.out.println(no);
			if (no%2==0)
				lit.remove();
			if (no%2!=0)
				lit.set(no+10);
			if (no==7)
				lit.add(7*7);
		}
		System.out.println("--------------------------------");
		System.out.println(numList);

		Collections.sort(nameList);
		Collections.sort(numList);
		System.out.println(nameList);
		System.out.println(numList);
	}

}
