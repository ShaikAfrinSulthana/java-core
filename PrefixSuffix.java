package com.learning.core.day3session1;

public class PrefixSuffix {
	
	 static int longestPrefixSuffix(String str) 
	    { 
	      int[] A = new int[str.length()]; 
	        int j = 0, i = 1; 
	        while(i < str.length()) 
	        { 
	            if(str.charAt(i) == str.charAt(j)) 
	            { 
	                A[i] = j+1; 
	                j++; 
	                i++; 
	            } 
	            else
	            { 
	                if(j==0) 
	                    i++; 
	                else
	                    j = A[j-1]; 
	                  
	            } 
	        } 
	  
	        return A[str.length()-1]; 
	    } 
	      
	    // Driver program  
	    public static void main (String[] args)  
	    { 
	        String s = "aabcdaabc"; 
	        System.out.println(longestPrefixSuffix(s)); 
	    } 
} 
