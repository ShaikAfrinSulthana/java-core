package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P03E {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the number : ");
		int num = input.nextInt();
		long fact = factorial(num);
		System.out.println("factorial is " + fact);
	}
	
	public static long factorial(int num) {
		if (num < 2) {
			
			return 1;
		}
		long fact = 1;
		int i = 2;
		while(i <= num) {
			
			fact *= i;
			
			i++;
		}
		return fact;
	}
	

}
