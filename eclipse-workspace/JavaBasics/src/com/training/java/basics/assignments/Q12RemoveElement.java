package com.training.java.basics.assignments;

import java.util.Scanner;
// remove a specific element from an array


public class Q12RemoveElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		for(int i =0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the index");
		int index = scanner.nextInt();
		
		for(int i = index; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		// print
		System.out.println("new array");
		for(int i =0; i<arr.length -1; i++) {
			System.out.print( +arr[i] + " ");
		}
		
		scanner.close();

	}

}
