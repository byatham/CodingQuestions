package com.anu.tech.faqs;

public class SwapWithOutThirdVariable {
	public int temp = 0;

	public void swapNumbers(int a, int b) {

		System.out.println("before swap a,b :" + a + " ," + b);
		try {
			a = a + b;
			b = a - b;
			a = a - b;

			System.out.println("after swap a,b :" + a + " , " + b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapWithOutThirdVariable obj = new SwapWithOutThirdVariable();
		obj.swapNumbers(10, 20);

	}

}
