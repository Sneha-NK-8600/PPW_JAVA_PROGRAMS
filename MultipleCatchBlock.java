/* ---------------------

# 5. Multiple Catch Blocks

**Case Study:**
A scientific calculator performs arithmetic operations and accesses arrays. Different runtime errors may occur while executing the program.

**Question:**
Write a Java program that demonstrates the use of multiple 'catch' blocks to handle 'ArithmeticException', 'ArrayIndexOutOfBoundsException', and any other unexpected exceptions.

--------------------- */

import java.util.Scanner;

class MultipleCatchBlock
{
public static void main(String args[])
{
int arr[]=new int[5];
int res;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Array Elements:");
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
try
{
	res=arr[4]/0;
	System.out.println(arr[7]);
}
catch(java.lang.ArithmeticException ex)
{
	System.out.println(ex.toString());
}
catch(java.lang.ArrayIndexOutOfBoundsException ex)
{
	System.out.println(ex.getMessage());
}
System.out.println("Program Run Successfully...!!!");	
}
}
