import java.util.*;

class SwapWithoutThird 
{
 public static void main(String[] args) 
 {
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter the first number:");
     int a=sc.nextInt();
     int a1=a;

     System.out.println("Enter the second number:");
     int b=sc.nextInt();
     int b1=b;

     System.out.println("Swapping two number without using third variable:");
     a = a + b;
     b = a - b;
     a = a - b;

     System.out.println("Before  Swapping:");
     System.out.println("a = " + a1);
     System.out.println("b = " + b1);

     System.out.println("After Swapping:");
     System.out.println("a = " + a);
     System.out.println("b = " + b);
 }
}