package com.anu.tech;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="balaiah";
		char[] nameChar=name.toCharArray();
		for(int i=0; i<nameChar.length;i++)
		{
			boolean repeated=false;
			for(int j=i+1; j<nameChar.length;j++)
			{
				if(nameChar[i]== nameChar[j])
				{
					System.out.println(nameChar[i]);
					repeated=true;
				}
			}
		}

	}

}
