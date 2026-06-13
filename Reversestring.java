/* Write a Java program to reverse a string. */

import java.util.Scanner;

class Reversestring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.next();

        String rev="";

       for(int i=s.length()-1; i>=0; i--)
        {
            rev=rev+s.charAt(i);
        }

        System.out.println("Reversed string is :"+rev);

    }
}