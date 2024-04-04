package com.learning.core.day3session1;

import java.util.Scanner;

public class Palindrome {
 
		public static void main(String[] args) {
			
			System.out.print("Enter any string : ");
			Scanner in = new Scanner(System.in);
			
			//Original string
			String name = in.nextLine();
			 
			System.out.println(name.toUpperCase());
			System.out.println(name.length());
			
			
			//Reverse string
			String reverseString = new StringBuilder(name).reverse().toString();
			
			// Check palindrome string
			if (name.equals(reverseString)) {
				System.out.println("String is a palindrome.");
			} else {
				System.out.println("String is not a palindrome.");
			}
		}
	}