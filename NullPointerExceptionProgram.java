/* ---------------------

# 3. Null Pointer Exception

**Case Study:**
An employee management system stores employee names. Due to missing data, an employee name may be 'null'. The system should handle such situations without terminating.

**Question:**
Write a Java program that attempts to access a null string and handles the 'NullPointerException'.

--------------------- */
import java.util.Scanner;
import java.lang.*;

class NullPointerExceptionProgram
{
public static void main(String args[])
{
int empId=10;
String emp1="Sneha";
String emp2=null;

try
{
	System.out.println("Length of Employee Name is:"+emp2.length());
}
catch(NullPointerException ex)
{
	System.out.println(ex.getMessage());
}
System.out.println("Program run Successfully...!!!");
}
}
