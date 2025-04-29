package com.training.java.basics.assignments;

import java.util.Scanner;

// insert an element (specific position) into an array
public class InsertAnElementInArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		for(int i =0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("enter the number to be inserted");
		int num = scanner.nextInt();
		System.out.println("Enter the index");
		int index = scanner.nextInt();
		
		//shifting the values after the given 'index' to the right
		for(int i = arr.length-1; i>index; i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = num;
		
		// print
		System.out.println("new array");
		for(int i =0; i<arr.length; i++) {
			System.out.print( +arr[i] + " ");
		}
		
		scanner.close();
		
	}

}
