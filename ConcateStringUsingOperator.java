/* Write a Java program to concatenate two strings.
Using + operator
Using concat() method
Without using library function */

import java.util.Scanner;

class ConcateStringUsingOperator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string: ");
        String s1=sc.next();
		System.out.println("Enter second string:  ");
        String s2=sc.next();

		String s3="";
		System.out.println("Concatenation of "+s1+" and "+s2+ "is: "+(s1+s2));

	}
}