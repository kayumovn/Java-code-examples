package com.java.coding;

public class Swap2Integer {

	public static void main(String[] args) {
		int x =5;
		int y =10;
		
		/*x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);*/

		/*x=x*y;
		y=x/y;
		x=x/y;
		System.out.println(x);
		System.out.println(y);*/
		
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x);
		System.out.println(y);
				
	}

}
