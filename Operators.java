package com.bpi.exercises;
import java.util.Scanner;

public class Operators {
	
	public  static 	int addNumbers(int first_int, int second_int) {
		return first_int + second_int;
	}
	
	public  static 	int subtractNumbers(int first_int, int second_int) {
		return first_int - second_int;
	}
	
	public  static	int multiplyNumbers(int first_int, int second_int) {
		return first_int * second_int;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int first_int;
		int second_int;
		
		System.out.println("Enter first Integer: ");
		first_int = input.nextInt();
		
		System.out.println("Enter second Integer: ");
		second_int = input.nextInt();
		
		System.out.println("Add: " + addNumbers(first_int,second_int));
		System.out.println("Difference: " + subtractNumbers(first_int,second_int));
		System.out.println("Product: " + multiplyNumbers(first_int,second_int));
		
	}

}
