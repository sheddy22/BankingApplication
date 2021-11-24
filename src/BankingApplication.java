import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount obj1 = new BankAccount("John", "BOOO1");
		obj1.showMenu();

	}

}
	// Bank account class with four variables
class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	// Created a constructor Bank account
	BankAccount(String cname,String cidcc)
	{
		customerName = cname;
		customerId = cidcc;
	}
	// Create a method deposit
		void deposit(int amount)
		{
			if(amount != 0)					
			{		
			balance = balance + amount;					// Increment balance with amount
			previousTransaction = amount;				// To show previous amount deposited
			}		
	
	}
	// Create a method withdraw
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balance = balance - amount;					// Deduct amount from balance
			previousTransaction = -amount;				// minus sign to indicate withdraw
		}
	}
	// create a getPreviousTransaction to return deposited amount or withdraw
	void getPreviousTransaction()
	{
		if(previousTransaction  > 0)
		{
			System.out.println("Deposited: "+previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("withdrawn: "+Math.abs(previousTransaction)); // used absolute to change negative value to positive
		}
		else 
		{
			System.out.println("No transaction occured");
		}
	}
	// Create a method showMenu
	void showMenu()
	{
		char option= '\0';								// same as initializing int with 0
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("welcome "+customerName);
		System.out.println("Your ID is "+customerId);
		System.out.println("\n");						// line break/ spacing
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");					// When ever the user enter E the loop will break
		
		do
		{
			System.out.println("##############################################");
			System.out.println("Enter an option: ");
			System.out.println("##############################################");
			option = scanner.next().charAt(0);			// Reading character from the console
			System.out.println("\n");
			
			switch(option)
			{
			
			case 'A':
				System.out.println("----------------------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("----------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("----------------------------------------------");
				System.out.println("Enter an amount to deposit:");
				System.out.println("----------------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;	
				
			case 'C':
				System.out.println("----------------------------------------------");
				System.out.println("Enter an amount to withdraw:");
				System.out.println("----------------------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;		
				
			case 'D':
				System.out.println("----------------------------------------------");
				System.out.println();
				System.out.println("----------------------------------------------");
				
				System.out.println("\n");
				break;	
				
			default:
				System.out.println("Invalid option!!.Please enter again");
				break;
			}
		
		}while(option != 'E');
		System.out.println("ThankYou for using our services");
	}
}