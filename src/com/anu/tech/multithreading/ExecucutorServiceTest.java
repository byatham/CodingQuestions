package com.anu.tech.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecucutorServiceTest {

	public static void main(String[] args) {
		
		Object obj=new Object();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 100; i++) {
		    Future<?> future = executor.submit(() -> {
		    	
		        try {
		        	Thread.sleep(10000);
		        	
			        System.out.println(Thread.currentThread().getName()+" ::: ");
			        
			        obj.wait();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    });
		    
		    executor.submit(() -> {
		        System.out.println("*****************&&&&&&&&&&&&&&&&&&&&&&&%%%%%%%%%%%%%%%%###########");
		       // obj.notify();
		    });
		}
		executor.shutdown();


	}

}


