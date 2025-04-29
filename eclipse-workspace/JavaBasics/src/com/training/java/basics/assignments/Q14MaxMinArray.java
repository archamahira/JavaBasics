package com.training.java.basics.assignments;

import java.util.Scanner;

// find the maximum and minimum value of an array 
public class Q14MaxMinArray {

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
		
		int min = arr[0]; // storing first element to the min variable
		for(int i =0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum value: " + min);
		
		int max = arr[0]; // storing first element to the max variable
		for(int i =0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum value: " + max);
		
		

	}

}
