package com.java.coding;

public class RemoveJunkChars {

	public static void main(String[] args) {
		String s = "$%$%^% testing^^&*&*& Selenium1234*(*&(*";
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
