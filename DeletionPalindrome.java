package com.learning.core.day3session1;

import java.util.Arrays;

public class DeletionPalindrome {
	
	    // Function to calculate minimum number of deletions
	    // to make a string palindromic
	    static int minimumNumberOfDeletions(String s) {
	        // length of given string
	        int n = s.length();
	        // dp array to compute minimum deletions
	        int[] dp = new int[n];
	 
	        // Iterate from end of s
	        for (int i = n - 2; i >= 0; i--) {
	            // prev used to store previous iteration
	            int prev = 0;
	            // Loop from i + 1 to n
	            for (int j = i + 1; j < n; j++) {
	                int temp = dp[j];
	                // If i and j have equal chars, store the prev
	                if (s.charAt(i) == s.charAt(j)) {
	                    dp[j] = prev;
	                } else {
	                    // Else, increment the count and make min
	                    dp[j] = Math.min(dp[j], dp[j - 1]) + 1;
	                }
	                // Store temp to prev
	                prev = temp;
	            }
	        }
	        // Minimum value stored in dp[n-1]
	        // as it is bottom-up
	        return dp[n - 1];
	    }
	 
	    // Driver Code
	    public static void main(String[] args) {
	        String str = "aebcbda";
	        System.out.println("Minimum number of deletions = " + minimumNumberOfDeletions(str));
	    }
}
	 



