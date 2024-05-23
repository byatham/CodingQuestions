package com.anu.tech.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* A queue that supports operations that wait for the queue to become non-empty when retrieving an element and wait for space to become 
 *available in the queue when storing an element.
 */

public class BlockingQueueTest {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

		Thread producer = new Thread(() -> {
		    try {
		        for (int i = 0; i < 20; i++) {
		            queue.put(i);
		            System.out.println("Produced: " + i);
		        }
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		});

		Thread consumer = new Thread(() -> {
		    try {
		        while (true) {
		            Integer item = queue.take();
		            System.out.println("Consumed: " + item);
		        }
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		});

		producer.start();
		consumer.start();

		
	}

}
