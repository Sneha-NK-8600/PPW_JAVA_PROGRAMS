/* Write a Java program to toggle case of each character in a string. */


import java.util.Scanner;
class ToggleCase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.next();

        String s1="";

       // System.out.println("Upper case of given string is :"+s.toUpperCase());
       // System.out.println("Upper case of given string is :"+s.toLowerCase());
  
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
            {
                s1 = s1 + (char)(s.charAt(i) + 32);   // converting upper to lower 
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                s1 = s1 + (char)(s.charAt(i) - 32);   // converting LOwer to upper
            }
        }
        System.out.println("Toggle Case of given String is: "+s1);

    }
}