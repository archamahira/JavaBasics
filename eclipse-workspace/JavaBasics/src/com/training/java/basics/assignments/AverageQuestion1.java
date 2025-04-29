package com.training.java.basics.assignments;

import java.util.Scanner;

/*
 * Accept three numbers from the keyboard and print the sum and average of them
 *
 * */

public class AverageQuestion1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // creates object of Scanner class
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt(); 
		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt(); 
		
		System.out.println("Enter the third number: ");
		int num3 = sc.nextInt();
		
		
		double sum = 0;
		sum = num1 + num2 + num3;
		
		double average = sum/ 3;
				
		System.out.println("average of numbers: " + average);
		
		sc.close();
	}
	
}
