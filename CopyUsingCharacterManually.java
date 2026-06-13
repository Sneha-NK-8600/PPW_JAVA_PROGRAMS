/* Write a Java program to copy one string into another string.
Using assignment operator
By copying each character manually */

import java.util.Scanner;

class CopyUsingCharacterManually
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.next();
        String s1="";
        
        for(int i=0;i<s.length();i++)
        {
           s1=s1+s.charAt(i);
        }  

        System.out.println("First String: "+s);
        System.out.println("Copied String: "+s1);
    }
}
