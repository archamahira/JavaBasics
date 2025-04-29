package com.training.java.basics.assignments;

import java.util.Scanner;

/*
 *  accept Name, Age, Gender and Address (single line) of a person from the user and print them in separate lines 
 * 
 * */

public class Q7UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // creates object of Scanner class
		System.out.println("Enter the details: Name, Age, Gender and address ");
		String input = sc.nextLine();

	    String[] details = input.split(",");
	    String name = details[0];
	    String age = details[1];
	    String gender =  details[2];
	    String address =  details[3];
 
	    System.out.println("Name: " + name);
	    System.out.println("age: " + age);
	    System.out.println("gender: " + gender);
	    System.out.println("address: " + address);
        sc.close();
	}

}
