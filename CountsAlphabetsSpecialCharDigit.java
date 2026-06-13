/* Write a Java program to count:
Alphabets
Digits
Special characters
in a string. */

import java.util.Scanner;

class CountsAlphabetsSpecialCharDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String s=sc.next();
       int  countalp=0;
       int  countdig=0;
        int countspe=0;

         for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || 
               (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
            {
                countalp++;
            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                countdig++;
            }
            else
            {
                countspe++;
            }
        }

        System.out.println("Alphabets in Given string is: "+countalp);
        System.out.println("Digits in Given string is: "+countdig);
        System.out.println("Special Characters in Given string is: "+countspe);

    }
}