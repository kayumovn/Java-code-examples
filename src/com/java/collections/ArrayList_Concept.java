package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Concept {

	public static void main(String[] args) {
		int [] a = new int[3]; // static array --> size is fixed.
		a[0]=10;
		System.out.println(a.length);
		//Dynamic array--> ArrayList.
		//1. Can contain duplicate values/elements
		//2. Maintains insertion orders
		//3. Synchronized.
		//4. Allows random access to fetch elements because it stores values on the basis of indexes
		
		//Non-generic arraylist
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		System.out.println(ar.size());
		System.out.println(ar);
		ar.add(50);
		ar.add(60);
		System.out.println(ar.size());
		
		System.out.println(ar.get(4)); // to fetch value from index
		
		//Print all values of ArrayList:
		//1. Using for loop
		//2. Using iterator
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//Generic arraylist
		
		ArrayList<Integer>ar1=new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		ar1.add(300);
		ar1.add(400);
		ar1.add(500);
		System.out.println("**************************");
		//Merging two arraylist.
		ArrayList<String>ar6=new ArrayList<String>();
		ar6.add("Testing");
		ar6.add("Java");
		ar6.add("Selenuim");
		for(int j=0;j<ar6.size(); j++) {
			System.out.println(ar6.get(j));
		}
		System.out.println("*******************");
		ArrayList<String>ar7=new ArrayList<String>();
		ar7.add("Coding");
		ar7.add("PHP");
		ar7.add("QTP");
		for(int p=0;p<ar7.size();p++) {
			System.out.println(ar7.get(p));
		}
		System.out.println("*******************");
		// add.All();
		ar6.addAll(ar7);
		
		for(int i=0; i<ar6.size(); i++) {
			System.out.println(ar6.get(i));
		}
		System.out.println("*****************");
		//removeAll();
		ar6.removeAll(ar7);
		for(int i=0; i<ar6.size(); i++) {
			System.out.println(ar6.get(i));
		}
		
		System.out.println("*********************");
		
		Employee e1=new Employee("John", 25, "QA");
		Employee e2=new Employee("Smith", 23, "DEV");
		Employee e3=new Employee("John", 28, "Admin");
		
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Using iterator to fetch values
		Iterator<Employee>it= ar4.iterator();
		while(it.hasNext()) {
		Employee emp=it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		}
		
		
		
		
		

	}

}
