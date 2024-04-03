package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P03B {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter your percentage : ");
		float percentage = input.nextFloat();
		
		
		if(percentage >= 60) { 
			
			System.out.println("you got A grade ");
		}else if(percentage >= 45)
		{
			System.out.println("you got B grade ");
		}
			else if(percentage >= 35) {
		    System.out.println("you got C grade");
			}

				else if(percentage < 35) {
					System.out.println("Failed!");
				} 
				else {
					System.out.println("Entered percentage is Invalid");
				}
					

	}
}
