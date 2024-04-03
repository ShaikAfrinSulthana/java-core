package com.learning.core.day2session4;

import java.util.Scanner;

class D0P04B {
	
	static int arr[] = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0}; 
	
	static int sum() {
		

        int sum = 0; // initialize sum
        int i;
 
        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
 
        return sum;
    }
 
    // Driver method
    public static void main(String[] args)
    {
        System.out.println("Sum of given array is "
                           + sum());
    }
}
