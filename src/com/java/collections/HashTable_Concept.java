package com.java.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable_Concept {

	public static void main(String[] args) {
		
		//It is similar to hashMap but it is synchronized
		//Stores the values on the basis of key--value
		// Key-->Object---Hashcode-->Value
		// Contains only unique values
		
		Hashtable h1=new Hashtable();
		h1.put(1, "Nuriddin");
		h1.put(2, "Testing");
		h1.put(3, "Selenium");
		h1.put(3, "Selenium");// only unique value
		h1.put(null, "Java"); // no null key and values
		 
		//create a clone 
		Hashtable h2=new Hashtable();
		h2=(Hashtable)h1.clone();
		
		System.out.println("value of h1 is: "+ h1);
		System.out.println("value of h2 is: "+ h2);
		
		//deleting
		h1.clear();
		
		System.out.println("value of h1 is: "+ h1);
		System.out.println("value of h2 is: "+ h2);
		
		//contains value
		
		Hashtable st =new Hashtable();
		st.put("A", "John");
		st.put("B", "Manager");
		st.put("C", "QA");
		
		if(st.contains("John")) {
			System.out.println("value is found");
			
			//print all values of Hashtable using ---> Enumeration -- elements();
			
		Enumeration e =	st.elements();
		System.out.println("print values from st:");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
			//get all values from Hashtable using ---entrySet()---set of Hashtable values
			System.out.println("print values from hashtable using entrySet:");
			Set s = st.entrySet();
			System.out.println(s);
			
			//comparing two hashtables:
			
			Hashtable st1 =new Hashtable();
			st1.put("A", "John");
			st1.put("B", "Manager");
			st1.put("C", "QA");
		
			if(st.equals(st1)) {
				System.out.println("both are equal");
				
				//get value from key
				System.out.println(st1.get("B"));
				
				//get hashcode of hashtable
				System.out.println("Value of hashcode of hashtable is: " +st1.hashCode());
			}
		}
		
		}

	}

}
