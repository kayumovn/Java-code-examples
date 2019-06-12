package com.java.coding;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "Examples of string Manupulations In selenium";
		String str1 ="Examples of string Manupulations in selenium";
		System.out.println(str.length());
		System.out.println(str.charAt(10));
		System.out.println(str.indexOf('f'));
		System.out.println(str.indexOf('s',str.indexOf('s')+12));
		System.out.println(str.indexOf('n'));
		
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0, 15));
		String str2 = "   Hello World   ";
		System.out.println(str2.trim());
		System.out.println(str2.replace(" ", ""));
		
		String date = "02-02-2018";
		System.out.println(date.replace("-", "/"));
		
		String test = "Hello_World_Test_Selenium";
		String testval [] = test.split("_");
		for(int i=0; i<testval.length; i++) {
			System.out.println(testval[i]);
		}
		
	}

}
