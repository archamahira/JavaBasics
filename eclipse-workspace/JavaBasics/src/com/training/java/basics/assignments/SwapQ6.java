package com.training.java.basics.assignments;

/*
 * to swap two variables
 * */

public class SwapQ6 {

	public static void main(String[] args) {
		int a = 6;
		int b = 12;
		
		System.out.println("Numbers before swapping:" +a + ", " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Numbers after swapping:" + a + ", " + b);

	}

}
