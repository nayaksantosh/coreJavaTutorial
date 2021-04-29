package com.corejava.Overloading;

public class ExecuterClass {
	
	
	
	//this.execlass(obj);
	
	
	public void execlass (ClassWithOverloadedMethod localObj)
	{
		//localObj.operate(21, 45); //ambiguty for (int, float) (float, int)
		//localObj.operate(21, 45.0f, 4.5f);
		//localObj.operate(21, 4.00f, 32);
		localObj.operate(21 , 45, 3 ,7.0f);	
	}

}
