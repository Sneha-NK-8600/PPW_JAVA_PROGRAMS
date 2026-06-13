import java.util.*;

class Percentage
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter marks of subject1:");
      int sub1=sc.nextInt();
      
      System.out.println("Enter marks of subject2:");
      int sub2=sc.nextInt();
    
      System.out.println("Enter marks of subject3:");
      int sub3=sc.nextInt();
      
      System.out.println("Enter marks of subject4:");
      int sub4=sc.nextInt();
      
      System.out.println("Enter marks of subject5:");
      int sub5=sc.nextInt();

      int total=sub1+sub2+sub3+sub4+sub5;
      double percentage=(total/500.0)*100;

      System.out.println("Total marks: " + total);
      System.out.println("Percentage: " + percentage + "%");

    }
}
