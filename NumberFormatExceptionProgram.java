/* ---------------------

# 4. Number Format Exception

**Case Study:**
An online banking system accepts the account number as numeric input. If a user enters alphabetic characters instead of numbers, the system should display an error.

**Question:**
Write a Java program to convert a string into an integer using 'Integer.parseInt()'. Handle the 'NumberFormatException' for invalid input.

--------------------- */

import java.util.Scanner;
import java.lang.*;

class NumberFormatExceptionProgram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Account Number:");
String accno=sc.next();

try
{
int accountno=Integer.parseInt(accno);
System.out.println(accountno);
}
catch (NumberFormatException ex)
{
	System.out.println("String Cannot be Converted to Integer "+ex.toString());
}
System.out.println("Program Run Successfully...!!!");
}
}
