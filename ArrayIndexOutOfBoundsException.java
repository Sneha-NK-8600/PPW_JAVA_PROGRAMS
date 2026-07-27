/* ---------------------

# 2. Array Index Out of Bounds Exception

**Case Study:**
A school management system stores student marks in an array. Sometimes, a user requests the marks of a student whose index does not exist.

**Question:**
Write a Java program to access an array element based on the user's index. Handle the 'ArrayIndexOutOfBoundsException' by displaying an appropriate message.

--------------------- */

import java.util.Scanner;

class ArrayIndexOutOfBoundsExceptionProgram
{
public static void main(String args[])
{
int arr[]=new int[5];

Scanner sc=new Scanner(System.in);

System.out.println("Enter 5 Student Marks:");
for(int i=0;i<arr.length;i++)
{
 arr[i]=sc.nextInt();
}
try
{
	System.out.println(arr[6]);
}
catch(java.lang.ArrayIndexOutOfBoundsException ex)
{
	System.out.println(ex.toString());
}
System.out.println("Program Run Successfully...!!!");
}
}


