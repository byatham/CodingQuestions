package com.anu.tech.ds;

import java.util.PriorityQueue;

//10. PriorityQueue
//Description: An implementation of the Queue interface that orders elements based on their natural ordering or a specified comparator.
//Usage: PriorityQueue is useful for tasks that require processing elements in a specific order, such as scheduling tasks based on priority.
public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(5);
		priorityQueue.add(1);
		priorityQueue.add(3);
		System.out.println(priorityQueue);

	}

}
