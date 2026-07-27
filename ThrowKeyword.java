/* ---------------------

# 7. Throw Keyword

**Case Study:**
A driving license portal allows only applicants who are "18 years or older". 
If the applicant is underage, the system should explicitly generate an exception.

**Question:**
Write a Java program that checks the applicant's age. Use the 'throw' keyword to generate an exception if the age is below 18.

--------------------- */

import java.util.Scanner;

class ThrowKeyword
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age;
System.out.println("Enter Your Age:");
age=sc.nextInt();

try
{
if(age<18)
{
throw new Exception("You are not Eligible for License");
}
}
catch(Exception ex)
{
System.out.println(ex);
}
System.out.println("Program Run Successfully");
}
}
