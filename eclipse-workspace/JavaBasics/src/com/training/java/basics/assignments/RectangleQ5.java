package com.training.java.basics.assignments;

/*
 * to print the area(width*height) and perimeter(2*(width+height)) of a rectangle
 * */
public class RectangleQ5 {

	public static void main(String[] args) {
		int width = 7;
		int height = 10;
		
		double area = width * height;
		System.out.println("Area: " + area);
		
		double perimeter = 2 * (width + height);
		System.out.println("Perimeter: " + perimeter);

	}

}
