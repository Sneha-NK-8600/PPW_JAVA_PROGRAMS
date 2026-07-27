/* ---------------------

# 9. Custom Exception

**Case Study:**
A CET admission system requires students to obtain **at least 40 marks** to qualify for admission. If the marks are below the minimum requirement, a custom exception should be raised.

**Question:**
Write a Java program to create a custom exception named 'InvalidMarksException'. Throw the exception when the student's marks are less than 40.

--------------------- */

import java.util.Scanner;

class InvalidMarksException extends Exception
{
InvalidMarksException(String msg)
{
super(msg);
}
}
class CustomExceptionProgram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Marks:");
int marks=sc.nextInt();

try
{
if(marks<40)
{
throw new InvalidMarksException("Marks are less than 40 , So You are not Eligible for Admission");
}

System.out.println("You are Eligible for Admission");
}
catch(InvalidMarksException ex)
{
System.out.println(ex.getMessage());
}
}
}