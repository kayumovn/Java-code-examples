package com.java.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Concept {

	public static void main(String[] args) {
		
		LinkedList<String>ll=new LinkedList<String>();
		
		//add
		ll.add("testing");
		ll.add("Java");
		ll.add("Selenium");
		System.out.println("content of linkedlist is: " +ll);
		
		//addFirst()
		ll.addFirst("Nuriddin");
		System.out.println("content of linkedlist is: " +ll);
		
		//addLast()
		ll.addLast("Automation");
		System.out.println("content of linkedlist is: " +ll);
		
		//get
		System.out.println(ll.get(0));
		
		//set
		ll.set(0, "John");
		System.out.println("content of linkedlist is: " +ll);
		
		//removeFirst(), removeLast()
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist is: " +ll);
		
		//remove()
		ll.remove(2);
		System.out.println("content of linkedlist is: " +ll);
		
		//Print all values 
		//using for loop
		System.out.println("***using for loop****");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("********using advance for loop****");
		
		//using advance for loop
		for(String str : ll) {
			System.out.println(str);
		}
		
		System.out.println("***using iterator***");
		//using iterator
		Iterator<String>it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("********using while loop*********");
		//using while loop
		
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
	}

}
