package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P03 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the number to get the desired month : ");
		int num = input.nextInt();
		
		
		if(num == 1) { 
			
			System.out.println("It is January");
		}else if(num == 2)
		{
			System.out.println("It is Febraury");
		}
			else if(num == 3) {
		    System.out.println("It is March");
			}

				else if(num == 4) {
					System.out.println("It is April");
				}
					else if(num == 5) {
						System.out.println("It is May");
					}
						else if(num == 6) {
							System.out.println("It is June");
						}
							else if(num == 7) {
								System.out.println("It is July");
							}
								else if(num == 8) {
									System.out.println("It is August");
								}
									else if(num == 9) {
										System.out.println("It is September");
									}
										else if(num == 10) {
											System.out.println("It is October");
										}
											else if(num == 11) {
												System.out.println("It is November");
											}
												else if(num == 12) {
													System.out.println("It is December");
												}
													else  {
														System.out.println("It is Invalid");
			
		}
		
	}

}
