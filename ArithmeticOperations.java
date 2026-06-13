import java.util.*;

class ArithmeticOperations
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number:");
        int n1=sc.nextInt();

        System.out.println("Enter first number:");
        int n2=sc.nextInt();

        System.out.println("Performing Arithmetic Operations");
        
        System.out.println("Addition: " + (n1+n2));
        System.out.println("Subtraction: " + (n1-n2));
        System.out.println("Multiplication: " + (n1*n2));
        System.out.println("Division: " + (n1/n2));
   }
}