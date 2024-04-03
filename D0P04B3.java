package com.learning.core.day2session4;

public class D0P04B3 {  
		public static int getSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[0];  
		}  
		public static void main(String[] args){  
		int a[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};  
		  
		System.out.println("Smallest: "+getSmallest(a,18));  
	 
		}  

}
