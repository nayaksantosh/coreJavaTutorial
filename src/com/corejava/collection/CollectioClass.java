package com.corejava.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectioClass {
	
	
	List listObject = new ArrayList();
	
	void addValueToCollection()
	{  
		listObject.add("santosh");
		listObject.add(55);
		listObject.add(15);
		//listObject.add(new String("Santosh"));
	}
	
	void printList() {
	Iterator it = listObject.iterator();
	
	int result = 0;
	while(it.hasNext())
	{
	    result = result + (Integer)it.next(); 
		System.out.println(result);
		
	}

}
}