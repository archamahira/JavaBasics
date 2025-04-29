package com.training.java.basics.assignments;

/*
 * find the index of an array element
 * */
public class Q11FindIndex {

	public static void main(String[] args) {
		int arr[] = {5, 8, 3, 0, 7};
		
		int value = 0;
		
		int index = -1;
		
		for(int i =0; i< arr.length; i++) {
			if(arr[i] == value) {
				index = i;
			}
		}
		
		if (index != -1) {
			System.out.println("Index of " + value + " is " + index);
		}else
		System.out.println("Array does not contain the number: " + value); 

	}

}
