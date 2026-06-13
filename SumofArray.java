import java.util.Scanner;

class SumofArray
{
    public static void main(String args[])
    {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an Array:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        int sum=0;

       System.out.println("Enter " + size + " Elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Sum of Array Elements is :");
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }

       System.out.print(sum);
    }
}