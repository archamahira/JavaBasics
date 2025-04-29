package com.training.java.basics.assignments;

import java.util.Scanner;

/*
 * to print the area (r2) and perimeter(2 r) of a circle
 * 
 * A = πr²
 * 
 * P = 2πr
 * 
 * */
public class CircleQ4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // creates object of Scanner class
		System.out.println("Enter the radius of a circle: ");
		int radius = sc.nextInt(); 
		
		double area = Math.PI * radius *radius;
		System.out.println("Area of a circle: " + area);
		
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Perimeter of a circle: " + perimeter);
		
        sc.close();

	}

}
