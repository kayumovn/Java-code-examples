package com.java.coding;

import java.util.HashSet;
import java.util.Set;

public class DublicateArray {

	public static void main(String[] args) {
		//1.Solution
		String [] cities = {"Chicago","NewYork","Boston","LasVegas","Chicago","Boston"};
		for(int i =0; i<cities.length; i++) {
			for(int j=i+1; j<cities.length; j++) {
				if(cities[i].equals(cities[j])) {
					System.out.println("Dublicate array is: " +cities[i]);
				}
			}
		}
		System.out.println("*****************************************");
		//2.Solution
		Set<String>store = new HashSet<String>();
		for(String name : cities) {
			if(store.add(name)==false) {
				System.out.println("Dublicate array is: " + name);
			}
	
		}
	}
}


