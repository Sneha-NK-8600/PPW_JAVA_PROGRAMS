import java.util.*;

class TriangleThirdAngle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first angle of triangle:");
        int a1=sc.nextInt();

        System.out.println("Enter second angle of triangle:");
        int a2=sc.nextInt();

        int a3=180-(a1+a2);

        System.out.println("Third angle of triangle is: " + a3);
    }
}