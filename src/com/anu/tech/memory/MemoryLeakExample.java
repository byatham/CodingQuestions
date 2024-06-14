package com.anu.tech.memory;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MemoryLeakExample {
    // This map will keep adding objects and never remove them, causing a memory leak.
    private static final Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
    	System.out.println("***********");
        while (true) {
            // Adding a large number of objects to the map
            for (int i = 0; i < 100000; i++) {
                String key = UUID.randomUUID().toString();
                String value = UUID.randomUUID().toString();
                map.put(key, value);
            }
            // Simulate some work to keep the application running
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
            finally
            {
            	System.out.println("*********** &&&&& ");

            	//map.clear();
            }
        	System.out.println("***********");
        	map.forEach((k,v)-> System.out.println(k+" "+v));

        }
    }
}
