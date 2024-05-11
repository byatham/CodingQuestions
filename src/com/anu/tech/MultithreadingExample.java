package com.anu.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadingExample {

    public static void main(String[] args) {
        // Create a thread pool with fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

      /*  // Submit tasks to the thread pool
        for (int i = 0; i < 5; i++) {
            int taskId = i;
            executor.submit(() -> {
                // Task logic
                System.out.println("Task " + taskId + " started by thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // Simulate some task execution time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskId + " completed by thread: " + Thread.currentThread().getName());
            });
        }

        // Shutdown the executor after all tasks are completed
        executor.shutdown(); */
        List<Integer> list=new ArrayList<>();
        
       for(int i=0; i<99999;i++)
       {
    	   list.add(i);
    	   int activeCount = Thread.currentThread().getThreadGroup().activeCount();
    	   System.out.println("activeCount "+activeCount);
    	  System.out.println("Thread name "+ Thread.currentThread().getName());
       }
       
      
    }
}
