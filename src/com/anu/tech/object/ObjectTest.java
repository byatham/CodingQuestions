package com.anu.tech.object;

public class ObjectTest implements Calculator{
	int a=10;
	
	public static Object getAdd(int a,int b)
	{
		return a+b;
	}
	
	//@Override
	//Object return we cannot change in subclass even as Object also
	//static we cannot add static key word also in sub class . 
	public  int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public static Object getSubstract(int a,int b)
	{
		return a-b+"";
	}
	
	
	public static void main(String[] args) {
		System.out.println("main class starts");
		ObjectTest obj=new ObjectTest();
		Calculator calObj=new ObjectTest();
		System.out.println(getAdd(10, 20));
		System.out.println(getSubstract(50,40));
		System.out.println(obj.add(10, 5));
		System.out.println(calObj.add(100, 300));

	}

	
}
