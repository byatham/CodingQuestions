package com.anu.tech.faqs;

public class SwapWithThirdVariable {
	
	public int temp=0;
	
	public  void swapNumbers(int a, int b)
	{
		
		System.out.println("before swap a,b :"+a+" ,"+b);
		try {
			temp=a;
			a=b;
			b=temp;
			System.out.println("after swap a,b :"+a+" , "+b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwapWithThirdVariable obj=new SwapWithThirdVariable();
		obj.swapNumbers(20, 50);
		
		
		

	}

}
