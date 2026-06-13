/* Write a Java program to compare two strings.
Using equals()
Using ==
Using equalsIgnoreCase()
Without using library function */

import java.util.Scanner;

class CompareStringUsingOperator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first String: ");
        String s1=sc.next();

        
        System.out.println("Enter Second String: ");
        String s2=sc.next();

        // intern() stores the strings in the String Pool, making references same if contents are same

        s1 = s1.intern();
        s2 = s2.intern();


        // this == compares the reference or address , not actual string
       if(s1==s2)
       {
        System.out.println("Both String are same");
       }
       else
       {
         System.out.println("Both String are different");
       }
    }
}
