package com.training.java.basics.assignments;

import java.util.Scanner;

// find the average of all the elements of an array
public class Q15Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		for(int i =0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int sum = 0; 
		for(int i =0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		double avg = sum / arr.length;
		
		System.out.println("Average: " + avg);

	}

}
