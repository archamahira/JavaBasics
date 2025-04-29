package com.training.java.basics.hackathon;

import java.util.Scanner;

/*
 * How to Split String in java?
 * */
public class Q11SplitString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence. ");
		String str = scanner.nextLine();
		
		String[] arr = str.split(" ");
		
		for(int i =0; i< arr.length; i++) {
		System.out.println(arr[i] + " ");
		}

		scanner.close();
	}

}
