package com.learning.core.day3session1;

import java.util.*;

public class Subsequencestring {
	 
	    // Declare a global list
	    static List<String> al = new ArrayList<>();
	 
	    
	    public static void main(String[] args)
	    {
	        String s = "abc";
	        findsubsequences(s, ""); // Calling a function
	        System.out.println(al);
	    }
	 
	    private static void findsubsequences(String s,
	                                         String ans)
	    {
	        if (s.length() == 0) {
	            al.add(ans);
	            return;
	        }
	 
	        // We add adding 1st character in string
	        findsubsequences(s.substring(1), ans + s.charAt(0));
	 
	        
	        findsubsequences(s.substring(1), ans);
	    }
	}