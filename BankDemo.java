package exception;
import java.util.InputMismatchException; 
import java.util.Scanner;

public class BankDemo {
	
	public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in); 
        Account ac = new Account(61120,"Vishnu",6000.0); 
        while (true)  
        { 
            System.out.println("\nBanking Menu"); 
            System.out.println("1. Deposit"); 
            System.out.println("2. Withdraw"); 
            System.out.println("3. Balance"); 
            System.out.println("4. Exit"); 
            System.out.print("Enter your choice: "); 
 

            try 
            { 
                int choice = sc.nextInt(); 

                switch (choice) 
                { 
                    case 1: 
                        System.out.print("Enter amount to deposit: "); 
                        double dAmount = sc.nextDouble(); 
                        ac.deposit(dAmount); 
                        break; 

                    case 2: 
                        System.out.print("Enter amount to withdraw: "); 
                        double wAmount = sc.nextDouble(); 
                        ac.withdraw(wAmount); 
                        break; 

                    case 3: 
                        ac.showBalance(); 
                        break; 

                    case 4: 
                        System.out.println("Thank you!!"); 
                        sc.close(); 
                        return; 

                    default: 
 
                        System.out.println("Invalid choice!!"); 
                } 

            } 
            catch (InputMismatchException e) 
            { 
                System.out.println("Invalid input!!"); 
                sc.nextLine();  
            } 
            catch (InsufficientBalanceException e) 
            { 
                System.out.println("Error: " + e.getMessage()); 
            } 
            catch (ArithmeticException e) 
            { 
                System.out.println("Error: " + e.getMessage()); 
            } 
        } 
    }
}
