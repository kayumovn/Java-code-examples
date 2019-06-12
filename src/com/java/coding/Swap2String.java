package com.java.coding;

public class Swap2String {

	public static void main(String[] args) {
		String a = "Java";
		String b = "Project";
		System.out.println(" Values of a and b before swaping");
		System.out.println(a);
		System.out.println(b);
		
		a = a+b;
		System.out.println(a);
		
		b = a.substring(0, a.length()-b.length());
		System.out.println(b);
		a = a.substring(b.length());
		
		System.out.println("Values of a and b after swaping");
		
		System.out.println(a);
		System.out.println(b);
	}

}
