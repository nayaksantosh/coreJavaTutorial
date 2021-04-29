package com.corejava;

import java.io.IOException;

import com.corejava.Exception.ExceptionHandling;
import com.corejava.Overloading.ClassWithOverloadedMethod;
import com.corejava.Overloading.ExecuterClass;
import com.corejava.collection.ExecuteClass;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		try {
		  ExceptionHandling objExce = new ExceptionHandling();
		  System.out.print(objExce.add(3,2));
		}
		
		
		/*
		 * catch(Throwable e) { System.out.print("CE it will be caught be Throwable "); }
		 * 
		 * catch bloch should be in order of first Child after parent else we will get Compilation error.
		 * Because all exception will caught by this catch block and it won't go to below catch block
		 *   
		 */
		/*catch(   IOException e)
		{
			System.out.print("Caught by Main of type Throwable");
		} */
		// in Multi catch block (Exception | Error e) should be from same level or we will get CE.
		// If we use Parent and child then we will get CE. e.g - 
		
		/*catch(RuntimeException | Exception e)
		{
			System.out.print("Caught by Main of type Throwable");
		} */
		 /*
		catch(Exception | Error e)
		{
			System.out.print("Caught by Main of type Throwable");
		}
		catch(Throwable e)
		{
			System.out.print("Caught by Main of type Throwable");
		}
		
		*/
		
		
		
		// new ExecuterClass().execlass(new ClassWithOverloadedMethod());
		new ExecuteClass();
		
		//System.out.print("Exception Caught");

	}

}
