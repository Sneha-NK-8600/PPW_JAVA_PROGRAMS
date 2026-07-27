/* ---------------------

# 6. Finally Block

Case Study: ATM Transaction

Case Study:

An ATM system allows customers to withdraw money from their accounts.
During the transaction, an exception may occur due to an invalid operation, such as wrong 
withdrawal amount entered. Regardless of whether the transaction succeeds or fails,
the ATM must always display a message indicating that the session has ended and the user's card can be removed.

Question:

Write a Java program that simulates an ATM transaction using try, catch, and finally. 
Ensure that the finally block always executes to display the message "Session ended. Please collect your card."

--------------------- */

import java.util.Scanner;
import java.util.InputMismatchException;

class ATMTransaction
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int balance=5000;

try
{   
    System.out.println("Enter Amount to Withdraw:");
    int withdrawamount=sc.nextInt();
	if(withdrawamount<=0)
	{
		System.out.println("Invalid Withdrawal Amount");
	}
	if(withdrawamount>balance)
	{
	 throw new Exception("Insufficient bqalance to Withdraw");
	}
	
	int currentbalance=balance-withdrawamount;
	System.out.println("Current Balance is :"+currentbalance);
	System.out.println("Amount Withdrawal successfully...!!!");

}
catch(Exception ex)
{
	System.out.println("Transaction Failed."+ex.getMessage());
}
finally
{
	System.out.println("Session ended. Please collect your card.");
}
System.out.println("Program Run Successfully...!!!");
}
}
