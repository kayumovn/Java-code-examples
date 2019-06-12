package com.java.coding;

public class ReversingString {

	public static void main(String[] args) {
		
		// using for loop
		String s = "Welcome to Uzbekistan";
	    int len = s.length();
		String rev1 = "";
		for(int i =len-1; i>=0; i--) {
		rev1 = rev1 + s.charAt(i);
		}
		System.out.println(rev1);
		
		// using StringBuffer
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
		
	}

}
