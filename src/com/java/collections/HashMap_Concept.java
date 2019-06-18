package com.java.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap_Concept {

	public static void main(String[] args) {
	
		//HashMap is class implements Map Interface
		//Extends AbstractMap class
		//It contains only unique elements
		//Stores the values key--value formats
		//It may have one null or multiple null values
		//It maintains no orders
		//It is Not synchronized ---> not thread safe
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Testing");
		hm.put(2, "Java");
		hm.put(3, "Automation");
		hm.put(4, "Test Completed");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(5));
		
		for(Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
			System.out.println(hm);
			hm.remove(3);
			System.out.println(hm);
			
			HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
			
			Employee e1=new Employee("John", 25, "QA");
			Employee e2=new Employee("Smith", 23, "DEV");
			Employee e3=new Employee("John", 28, "Admin");
			
			emp.put(1, e1);
			emp.put(2, e2);
			emp.put(3, e3);
			for(Entry <Integer,Employee> m : emp.entrySet()) {
			int key =	m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee " + key + " info:");
			System.out.println(e.name +" " +e.age +" "+ e.dept);
			}
		}

	}


