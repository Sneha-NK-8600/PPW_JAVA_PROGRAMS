import java.util.*;

class SwapUsingThird
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);

    System.out.println("Enter the first number:");
    int a=sc.nextInt();
    int a1=a;
    System.out.println("Enter the second number:");
    int b=sc.nextInt();
    int b1=b;
    System.out.println("Swapping two number using third variable:");

    int temp;
    temp=a;
    a=b;
    b=temp;

    System.out.println("Before  Swapping:");
    System.out.println("a = " + a1);
    System.out.println("b = " + b1);

    System.out.println("After Swapping:");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
}
}