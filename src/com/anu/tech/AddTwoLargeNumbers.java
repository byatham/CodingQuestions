package com.anu.tech;

public class AddTwoLargeNumbers {
	
	public static String add(String s1, String s2)
	{
		if(s1==null || s1.isEmpty())
			return s2;
		if(s2==null || s2.isEmpty())
			return s1;
		int len1=s1.length()-1;
		int len2=s2.length()-1;
		int carry=0;
		StringBuilder sbResult=new StringBuilder();
		while(len1>=0 && len2 >=0)
		{
			int n1=0;
			if(len1>=0)
			{
				n1=s1.charAt(len1)- '0';
				len1 --;
			}
			int n2=0;
			if(len2>=0)
			{
				n2=s2.charAt(len2)- '0';
				len2 --;
			}
			int sum=n1+n2+carry;
			int unit=sum%10;
			carry=sum/10;
			sbResult.append((char)unit+'0');
		}
		if(carry>0)
		{
			sbResult.append((char)carry+'0');
		}
		return sbResult.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******************************* Adding two large numbers");
		
		System.out.println(add("10","20"));
		

	}

}
