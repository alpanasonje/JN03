package com.tnsif.daythirteen;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(5);
		pq.add(3);
		pq.add(8);
		pq.add(5);
		pq.add(1);
		pq.add(8);
		pq.add(4);
		pq.add(5);
		System.out.println(pq);
		while(!pq.isEmpty())
			System.out.println(pq.remove());
	}

}
