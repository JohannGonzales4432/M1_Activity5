package com.bpi.exercises;

import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String 	str_age = "";
		int 	int_age;
		double 	dbl_age;
		
		System.out.println("Enter your age: ");		
		str_age = input.nextLine();
		
		int_age = Integer.parseInt(str_age);
		System.out.println("Your age in int: " + int_age);
		
		dbl_age = Double.parseDouble(str_age);
		System.out.println("Your age in double: " + dbl_age);
		
	
	}

}
