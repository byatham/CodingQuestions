package com.anu.tech.exceptions;

public class ExceptionsWithThrowNew {

	public static void main(String[] args) {
		
		try
        {
            NumberFormatException ex = new NumberFormatException();    //Creating an object to NumberFormatException explicitly
  
            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
        }
        catch(NumberFormatException ex)
        {
            System.out.println("explicitly thrown NumberFormatException object will be caught here");
        }
	}

}
