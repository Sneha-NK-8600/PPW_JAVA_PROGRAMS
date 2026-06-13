
import java.util.*;

class InputDataTypes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an integer number:");
        int num=sc.nextInt();
        
        System.out.println("Enter a Floating number:");
        float num1=sc.nextFloat();

        System.out.println("Enter a String:");
        String s=sc.next();

        System.out.println("Enter a Boolen Value:");
        boolean b=sc.nextBoolean();

        System.out.println("Enter a Double value:");
        double d=sc.nextDouble();

        System.out.println("Enter a Character:");
        char c=sc.next().charAt(0);

        System.out.println("Enter a long value:");
        long l=sc.nextLong();

        System.out.println("Integer: " + num);
        System.out.println("Float: " + num1);
        System.out.println("String: " + s);
        System.out.println("Boolean: " + b);
        System.out.println("Double: " + d);
        System.out.println("Character: " + c);
        System.out.println("Long: " + l);
    }

}