package com.corejava.Exception;

//To make checked exception we need to extends "Exception class "or "Throwable"
//if this is checked then we need to handle exception by using try catch or throws.
//If we are extending "RuntimeExeption" or "Error" the we don,t need to handle exception.
public class NmberFormateEception extends Exception{
	
	String msg;
	public NmberFormateEception(String inputString)
	{  
		System.out.println("OwnException called");
		msg = inputString; 
	}

}
