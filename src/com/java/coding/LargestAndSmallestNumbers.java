package com.java.coding;

import java.util.Arrays;

public class LargestAndSmallestNumbers {

	public static void main(String[] args) {
		int[]numbers= {-12,23,-59,543, 34, 677};
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}
        System.out.println("\n given array is: " + Arrays.toString(numbers));
        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest numer is: " + smallest);
	}

}
