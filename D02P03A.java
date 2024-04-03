package com.learning.core.day2session1;

import java.util.Scanner;

	public class D02P03A {
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			System.out.print("Please enter the number to get the desired month : ");
			int num = input.nextInt();
			
			
			if(num == 1) { 
				
				System.out.println("It is Monday");
			}else if(num == 2)
			{
				System.out.println("It is Tuesday");
			}
				else if(num == 3) {
			    System.out.println("It is Wednesday");
				}

					else if(num == 4) {
						System.out.println("It is Thursday");
					}
						else if(num == 5) {
							System.out.println("It is Friday");
						}
							else if(num == 6) {
								System.out.println("It is Saturday");
							}
								else if(num == 7) {
									System.out.println("It is Sunday");
								}
									
					               else  {
							         System.out.println("It is Invalid");
				
			}
			
		}

	}

