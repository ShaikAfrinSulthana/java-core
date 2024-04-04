package com.learning.core.day3session1;

import java.io.*;
import java.util.Scanner;

public class Replace20
{
    public static void main(String[] args) 
    {
    	
    	Scanner in = new Scanner(System.in);
        //String str = in.nextLine();
        System.out.print("please enter your String: ");
        String str = in.nextLine();
        // Instantiate the string
       
         
        // Trim the given string
        str = str.trim();
         
        // Replace All space (unicode is \\s) to %20
        str = str.replaceAll("\\s", "%20");
         
        // Display the result
        System.out.println(str);
    }
}