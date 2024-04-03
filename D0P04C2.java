package com.learning.core.day2session4;

public class D0P04C2 {
	

	    public static void main(String[] args) {
	        int[] Arr = { 3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0 };
	        int sum = 0;

	        for (int num: Arr) {
	           sum += num;
	        }

	        double average = sum / Arr.length;
	        System.out.format("The average is: %.2f", average);
	    }
	}

