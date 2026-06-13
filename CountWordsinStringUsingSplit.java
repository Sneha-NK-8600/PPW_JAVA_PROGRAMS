/* Write a Java program to count total number of words in a string.
Example: "I love india" → 3
Using split("\\s+")
Without using library function */

import java.util.Scanner;

class CountWordsinStringUsingSplit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();

        int count=0;
        
        String arr[] = s.split(" ");
        

        for(int i = 0; i < arr.length; i++)
        {
            count++;
        }

        System.out.println("Total number of words in given string is: "+count);
        


    }
}