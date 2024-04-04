package com.learning.core.day3session2;

import java.util.Scanner;

public class Home {
	
	int selectedOption;
	 BankAccount bankacc = new BankAccount();
    public void showMenu()
    {
        System.out.println("Please Select an option below:");
        System.out.println("Press 1 to Deposit Amount.");
        System.out.println("Press 2 to View Balance");
        System.out.println("Press any key to Exit");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Press any key:");
        selectedOption = scanner.nextInt();
        
        switch (selectedOption) {
            case 1:
                 Deposit d = new Deposit();
                 int depamt =  d.userInput();
                 bankacc.deposit(depamt);
                 showMenu();
                break;
                
            case 2:
                System.out.println("Your Account Balance is "+bankacc.getBalance(0)+" Rupees");
                System.out.println(" ");  
                showMenu();
              break;
      
          default:
                System.out.println("Transaction Ended");
                System.exit(0);
              break;
      }
        }

 }

