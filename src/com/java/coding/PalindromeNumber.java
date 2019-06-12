package com.java.coding;

public class PalindromeNumber {

	public static void isPalinDromeNumber(int num) {
	System.out.println("Given number is: " + num);
	int a = 0;
	int b = 0;
	int c;
	c = num;
	
	while(num>0) {
		a = num%10;
		b = (b*10)+a;
		num = num/10;
	}
	if(c == b) {
		System.out.println("Palindrome Number");
	}
	else {
		System.out.println("Not Palindrome Number");
	}
	
	}
	
	public static void main(String[] args) {
		isPalinDromeNumber(757);
		isPalinDromeNumber(345);
	}

}
