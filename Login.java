package com.learning.core.day3session2;

import java.util.Scanner;

public class Login {

    int ac_number = 1234;
    int ac_number1 = 12345;
    int balance = 1000;
    int balance1 = 5000;
    String cust_name = "sam";
    String cust_name1 = "jack";
    String ac_type = "savings";
    String ac_type1 = "current";
    int ac;
    int ac1;
    int b;
    int b1;
    String custname;
    String custname1;
    String actype;
    String actype1;
    public void acceptInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number:");
        ac = scanner.nextInt();
        System.out.println("Enter the Customer Name: ");
        custname = scanner.nextLine();
        System.out.println("Enter the account Type:");
        actype = scanner.nextLine();
        System.out.println("Enter the account Type:");
        b = scanner.nextInt();
        
        System.out.println("Enter the account number:");
        ac1 = scanner.nextInt();
        System.out.println("Enter the Customer Name:");
        custname1 = scanner.nextLine();
        System.out.println("Enter the account Type:");
        actype1 = scanner.nextLine();
        System.out.println("Enter the account Type:");
        b1 = scanner.nextInt();
        
    }

    public void verify() throws Exception{
         
        if(ac == ac_number && custname == cust_name && actype == ac_type && b == balance)
        {
            System.out.println("Login Successfull!");
            BankAccount bankacc = new BankAccount();
            System.out.println(" ");
            System.out.println("Your Balance is: "+bankacc.getBalance(ac)+"  Rupees");
            System.out.println(" ");
            Home home = new Home();
            home.showMenu();
        }else{
            InvalidBankTransaction lowbalance = new InvalidBankTransaction("Low Balance");
            System.out.println(lowbalance.getMessage());
            throw lowbalance;
        }
    
        
     if(ac1 == ac_number1 && custname1 == cust_name1 && actype1 == ac_type1 && b1 == balance1)
    {
        System.out.println("Login Successfull!");
        BankAccount bankacc = new BankAccount();
        System.out.println(" ");
        System.out.println("Your Balance is: "+bankacc.getBalance(ac)+"  Rupees");
        System.out.println(" ");
        Home home = new Home();
        home.showMenu();
    }else{
        InvalidBankTransaction negativebalance = new InvalidBankTransaction("Negative Balance");
        System.out.println(negativebalance.getMessage());
        throw negativebalance;
}
    }
}

