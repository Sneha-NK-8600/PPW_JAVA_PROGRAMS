/* Write a Java program to convert lowercase string to uppercase.
Write a Java program to convert uppercase string to lowercase. */


import java.util.Scanner;
class UpperLowerConversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.next();

        System.out.println("Upper case of given string is :"+s.toUpperCase());
        System.out.println("Upper case of given string is :"+s.toLowerCase());
    }
}