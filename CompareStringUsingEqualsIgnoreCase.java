/* Write a Java program to compare two strings.
Using equals()
Using ==
Using equalsIgnoreCase()
Without using library function */

import java.util.Scanner;

class CompareStringUsingEqualsIgnoreCase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first String: ");
        String s1=sc.next();

        
        System.out.println("Enter Second String: ");
        String s2=sc.next();
        
       if(s1.equalsIgnoreCase(s2))
       {
        System.out.println("Both String are same");
       }
       else
       {
         System.out.println("Both String are different");
       }
    }
}
