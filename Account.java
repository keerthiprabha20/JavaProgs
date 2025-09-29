package exception;

public class Account {

		  int accountNo; 
	      String name; 
	      double balance; 
	                     
	      public Account(int accountNo, String name, double balance) 
	     { 
	         this.accountNo = accountNo; 
	         this.name = name; 
	         this.balance = balance; 
	     } 
	 
	     public void deposit(double amount) 
	     { 
	         if (amount <= 0) 
	         { 
	             throw new ArithmeticException("Deposit amount must be positive!!"); 
	         } 
	         balance += amount; 
	         System.out.println("Deposited amount is: " + amount); 
	     } 
	 
	     public void withdraw(double amount) throws InsufficientBalanceException 
	     { 
	         if (amount <= 0)  
	         { 
	             throw new ArithmeticException("Withdrawal amount cannot be negative."); 
	         } 
	         if (amount > balance) 
	         { 
	 
	  
	             throw new InsufficientBalanceException("Insufficient balance!! Available:" + balance); 
	         } 
	         balance -= amount; 
	         System.out.println("Withdrawn amount is: " + amount); 
	     } 
	                    public void showBalance() 
	     { 
	         System.out.println("Account Balance:" + balance); 
	     } 
	 
	}


