package com.bpi.exercises;
import java.util.Scanner;

public class Basic_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String name = "";
		
		System.out.println("What is you name?");
		
		name = input.nextLine();
		
		System.out.println("Hello, " + name);
		
	}

}
