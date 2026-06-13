import java.util.*;

class SimpleIntrest
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter principal amount:");
    double p=sc.nextDouble();
    
    System.out.println("Enter rate of interest:");
    double r=sc.nextDouble();
    
    System.out.println("Enter time period:");
    double t=sc.nextDouble();
    
    double si=(p*r*t)/100;
    
    System.out.println("Simple Interest: " + si);
  }
}