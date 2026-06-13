
/*Write a Java program to find the length of a string.
Example: "pune" → 4 */

import java.util.Scanner;

class LengthofString
{public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.next();

        System.out.println("Length of String is:"+s.length());
    }
    
}