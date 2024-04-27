package com.anu.tech;

import java.util.stream.Stream;

public class StreamAndParallelStream {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("****************************");
		long starting, ending;
		Stream<Integer> numStream = Stream.of(1,2,3,4,5,6,7,8,9);
		
		 starting= System.currentTimeMillis(); // get the starting time
		 numStream.parallel().forEach(System.out::println);
		 Thread.sleep(5000);
		 ending=System.currentTimeMillis(); // get ending time
		   System.out.println("Elapsed time: "+(ending-starting));
   
	}

}
