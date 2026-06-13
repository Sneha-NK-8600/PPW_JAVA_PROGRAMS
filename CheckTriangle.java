import java.util.*;

class CheckTriangle
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter sides of Triangle:");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();

       if ((a+b>c) && (b+c>a) && (c+a>b))
       {
        System.out.println("Triangle is valid");
       }
       else
       {
        System.out.println("Triangle is not valid");
       }

       if(a==b && b==c)
       {
        System.out.println("Equilateral Triangle");
       }
       else if(a==b || b==c || c==a)
       {
        System.out.println("Isosceles Triangle");
       }
       else
       {
        System.out.println("Scalene Triangle");
        
       }
       }
    }