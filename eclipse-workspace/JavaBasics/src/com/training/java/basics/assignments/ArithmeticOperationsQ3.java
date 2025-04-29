package com.training.java.basics.assignments;

/*
 * to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * 
 * */
public class ArithmeticOperationsQ3 {

	public static void main(String[] args) {
		int a = 10; 
		int b = 20;
		
		int sum = a + b;
		System.out.println("sum: " + sum);
		
		int product = a*b;
		System.out.println("product: " + product);
		
		int sub = b - a; 
		System.out.println("sub: " + sub);
		
		double div = b / a;
		System.out.println("div: " + div);
		
		int rem = b % a;
		System.out.println("rem: " + rem);

	}

}
