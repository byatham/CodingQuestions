package com.anu.tech;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UnsupportedOperationExceptionTest {

	public static Integer a = 10;

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 3); // ();
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals(3)) {
				list.remove(value);

			}

			System.out.println("final list " + list);
		}
   //faq 2 check below code and guess output
		List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50);

		asList.stream().forEach(x -> {
			if (x == 50) {
				try {
					a = x;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		System.out.println("a " + a);

	}

}
