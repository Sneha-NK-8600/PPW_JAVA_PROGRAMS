import java.util.Scanner;

class LengthofString1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s=sc.next();
        int count=0;

        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)<s.length())
          {
            count++;
          }
        }
        System.out.println("Length of String is: "+count);
    }
}