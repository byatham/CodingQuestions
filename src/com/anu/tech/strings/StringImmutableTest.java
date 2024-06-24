package com.anu.tech.strings;

public class StringImmutableTest {

	public static void main(String[] args) {
		//we cannot modify string but we can modify string reference 
		System.out.println("StringImmutableTest starts ");
		String s = new String("Balu");
		String s1 = "Balu";
		String s2=s.concat("Yatham");// if we print s2 then BaluYatham will come . STring reference can be modified
		s.concat("Yatham");// if we print s then Balu will come 
		System.out.println(s2);
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode()==s1.hashCode());
		System.out.println(s2.hashCode()==s1.hashCode());

	}

}
