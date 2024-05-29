package com.anu.tech.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
//read it 
/* Thread-safe collections that allow concurrent access without external synchronization.
Examples include ConcurrentHashMap, CopyOnWriteArrayList, and BlockingQueue */

public class ConcurrentCollectionsTest {

	public static void main(String[] args) {
		ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("key", 1);
		map.putIfAbsent("key", 2);
		map.putIfAbsent("key1", 3);
		
         System.out.println("map "+map);

	}

}

