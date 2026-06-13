/* Write a Java program to count vowels and consonants in a string. */

import java.util.Scanner;

class VowelConsonant
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.next();
        int countvowel=0;
        int countconst=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
            {
                countvowel++;
            }
            else
            {
               countconst++;
            }
        }

        System.out.println("Vowels in the given string is: "+countvowel);
        System.out.println("Consonant in the given string is: "+countconst);
        
    }
}