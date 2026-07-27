/* # 1. Arithmetic Exception (Division by Zero)

**Case Study:**
A calculator application performs division operations. If the user enters **0 as the divisor**, the application should not crash. Instead, it should display an appropriate error message.

**Question:**
Write a Java program to divide two numbers. Handle the 'ArithmeticException' if the user attempts to divide by zero. */

import java.util.Scanner;

class ArithmeticException
{
public static void main(String args[])
{
int a,b,result;
Scanner sc=new Scanner(System.in);	
System.out.println("Enter Two Numbers:");
a=sc.nextInt();
b=sc.nextInt();
try
{
	result=a/b;
	System.out.println("Result is: "+result);
}
catch(java.lang.ArithmeticException ex)
{
	System.out.println(ex.toString());
}

System.out.println("Program Run Successfully...!!!");
}
}