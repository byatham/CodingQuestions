package com.anu.tech.multithreading;

public class MultiThreadingByJava7 implements Runnable {
	
	static int count=1;
	Object object;
	
	public MultiThreadingByJava7(Object object) {
		this.object=object;
	}
	
	@Override
	public void run() {
		System.out.println("inside run method ");
		while(count<=10)
		{
			if(count%2==0 && Thread.currentThread().getName().equals("even"))
			{
				synchronized(object)
				{
					System.out.println("Thread name "+Thread.currentThread().getName()+"value "+ count);
					count++;
					try {
						
						object.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			if(count%2!= 0 && Thread.currentThread().getName().equals("odd"))
			{
				//synchronized(object)
				//{
					System.out.println("Thread name "+Thread.currentThread().getName()+"value "+ count);
					count++;
						object.notify();
				//}
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		Object lock=new Object();
		Runnable r1=new MultiThreadingByJava7(lock);
		Runnable r2=new MultiThreadingByJava7(lock);
		
		new Thread(r1,"even").start();
		
		new Thread(r2,"odd").start();
		System.out.println(">>>>>");

	}

	

}
