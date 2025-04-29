package com.training.java.basics.assignments;

/*
 * test if any array contains a specific value
 * */
public class Q10SpecificValue {

	public static void main(String[] args) {
		
		int arr[] = {5, 8, 3, 0, 7};
		
		int value = 5;
		
		boolean found = false;
		
		for(int i =0; i< arr.length; i++) {
			if(arr[i] == value) {
				found = true;
			}
		}
		
		if (found) {
			System.out.println("Array contains: " + value);
		}else
		System.out.println("Array does not contain: " + value); 

	}

}
