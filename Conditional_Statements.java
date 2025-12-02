package com.bpi.exercises;
import java.util.Scanner;

public class Conditional_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int age;
		
		System.out.println("Enter your age: ");
		
		age = input.nextInt();
		
		if(age >=60) {
			System.out.println("Senior");
		}
		else if(age >= 18) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Minor");
		}
		
		input.close();
	}

}
