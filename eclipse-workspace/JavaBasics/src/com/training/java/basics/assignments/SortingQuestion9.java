package com.training.java.basics.assignments;
/*
 * Sort a numeric array and a string array
 * */
public class SortingQuestion9 {
	
	public static void sortIntArray(int[] arr) {
		int n = arr.length;
		
		for (int i =0; i<n-1; i++) {
			for(int j =0; j<n-i-1; j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void sortStringArray(String[] arr) {
		int n = arr.length;
		
		for (int i =0; i<n-1; i++) {
			for(int j =0; j<n-i-1; j++) {
				if(arr[j].compareTo(arr[j+1])> 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void printArray(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {2, 7, 1, 4, 3};
		sortIntArray(arr);
		printArray(arr);
		
		String[] str = {"apple", "banana", "mango", "fruit"};
		sortStringArray(str);
		printArray(str);
	}

}
