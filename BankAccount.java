package com.learning.core.day3session2;

public class BankAccount {
	
	private int accountNum;
	
	private String custName;
	
	private String accType;
	
	private float balance;
	
	int amount = 1000;
	
	public void initiate()
    {
        Login login = new Login();
        try{
            login.acceptInput();
            login.verify();
            
        }catch(Exception e)
        {
            try{
                login.acceptInput();
                login.verify();
                
            }catch(Exception f)
            {
               
             }
        }
    }
	
	
	
	public BankAccount() {
		super();
		this.accountNum = accountNum;
		this.custName = custName;
        this.accType = accType;
		this.balance = balance;
	}



	
	public void deposit(int bal){
        balance = balance + bal;
        System.out.println("Amount deposited Successfully");
        System.out.println(" ");
        System.out.println("Total Balance: " +balance);
        System.out.println(" ");
        }

	
    public float getBalance(float money){
    return amount;
 }
}
