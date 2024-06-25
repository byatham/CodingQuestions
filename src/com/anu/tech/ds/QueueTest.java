package com.anu.tech.ds;

import java.util.LinkedList;
import java.util.Queue;

//5. Queue
//A Queue is a First In, First Out (FIFO) data structure.
//Elements are added at the end and removed from the front.
public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("Element1");
		queue.add("Element2");
		String first = queue.remove(); // Remove element //Element1 removed
		System.out.println(queue.getClass());// [Element2]


	}

}
