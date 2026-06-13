/* Write a Java program to count total number of words in a string.
Example: "I love india" → 3
Using split("\\s+")
Without using library function */

import java.util.Scanner;

class CountWordsinStringWithoutUsingSplit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();

        int count=1;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
              count++;
            }
            
        }

        System.out.println("Total number of words in given string is: "+count);
        


    }
}