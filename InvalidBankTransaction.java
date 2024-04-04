package com.learning.core.day3session2;

public class InvalidBankTransaction extends Exception{
	
	     String errorMessage;
	     public InvalidBankTransaction(String message)
	     {
	        errorMessage = message;
	     }  
	      public String getMessage()
	      {
	          return errorMessage;
	    }
}


