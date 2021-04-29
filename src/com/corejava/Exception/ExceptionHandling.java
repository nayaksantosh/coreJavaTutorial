package com.corejava.Exception;

public class ExceptionHandling {
     
	public int add (int a, int b) throws Throwable 
	{ 
	  int result =0;
	   
	   if ( a>5 || b>5) {		   
		  System.out.print("Exception Caught");
		  throw new NmberFormateEception("input Number should be less then 5");
		 // System.out.print("Compile Error Unreachable Exception ");
	   }

	  
	   result = a+b;
		
	  return result;	
	}
	
	
}
