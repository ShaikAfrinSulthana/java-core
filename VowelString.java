package com.learning.core.day3session1;

import java.util.Scanner;

public class VowelString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter any string : ");
		Scanner in = new Scanner(System.in);
		
		//Original string
		String name = in.nextLine();
		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {
            // check if char[i] is vowel
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e'
                || name.charAt(i) == 'i'
                || name.charAt(i) == 'o'
                || name.charAt(i) == 'u') {
                // count increments if there is vowel in
                // char[i]
                count++;
            }
        } 
 
        // display total count of vowels in string
        System.out.println("Total no of vowels in string are: " + count);
        
  }
	}

