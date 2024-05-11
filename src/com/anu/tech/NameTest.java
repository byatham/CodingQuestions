package com.anu.tech;

public class NameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Yatham Balaiah";

		char[] charArray = name.toCharArray();

		for (int i = 0; i < charArray.length; i++)

		{
			for (int j = i + 1; j < charArray.length; j++) {

				if (charArray[i] == charArray[j])

				{

					// System.out.println(charArray[i]);
				} else {
					System.out.println(charArray[i]);

					return;

				}
			}
		}

	}

}
