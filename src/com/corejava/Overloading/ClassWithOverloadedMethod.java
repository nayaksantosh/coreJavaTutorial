package com.corejava.Overloading;

public class ClassWithOverloadedMethod  {

	 //Primitive type overloading
	//@Override
	/*
	 * public int operate(int a, int b) { System.out.println("Addition operation");
	 * return a+b; }
	 
	*/
	
	/*  public float operate(int a , float b) {
	  System.out.println(" operation with int and float ");
	  return a*b; } */
	 
	
	 public double operate( int c ,int a , float b, float d) {
	 	  System.out.println(" operation with int, int, float "); return a*b; }
	
	 public double operate(float a , int b ,int c, int d)
	   {
		System.out.println(" operation with float  int float ");
		return a*b;
	   }
	
		
	//public float operate(int c ,float a , float b) {
	//   System.out.println(" operation with int, float, float "); return a*b; }
		  
	 
	  
		 
}

