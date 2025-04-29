package com.training.java.basics.assignments;

import java.util.Scanner;

/*
 * Use Scanner Class to 1.Read an int, double, float, Boolean ….2.Store the values inside variables
 * 3.Print the values4.Perform some arithmeticObserve what errors you may get
 * 
 * */
public class Q8ReadInput{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer value");
		int num = scanner.nextInt();
		
		System.out.println("Enter an double value");
		double d_num = scanner.nextDouble();
		
		System.out.println("Enter an float value");
		float f_num = scanner.nextFloat();
		
		System.out.println("Enter an boolean value");
		boolean bool = scanner.nextBoolean();
		
		System.out.println("Integer: " + num);
		System.out.println("Double: " + d_num);
		System.out.println("Float: " + f_num);
		System.out.println("Boolean: " + bool);
		
		double sum = num + d_num + f_num;
		System.out.println("Sum of int, double and float: " + sum);
		
	
		scanner.close();
	}

}
