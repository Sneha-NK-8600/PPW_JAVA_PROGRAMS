/* Write a Java program to check whether a string is palindrome or not. */

import java.util.Scanner;

class StringPalindrome
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

        if(s.equals(rev))
        {
            System.out.println("Given string is palindrome");
        }
        else
        {
            System.out.println("Given string is not palindrome");
        }
    }
}