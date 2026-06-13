import java.util.Scanner;

class CopyArrayElements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array  size:");
        int size=sc.nextInt();

         int arr[]=new int[size];
         int arr1[]=new int[size];

       System.out.println("Enter " + size + " Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Copying Array elements:");

        for(int i=0;i<size;i++)
        {
                 arr1[i]=arr[i];
        }

        System.out.println("First Array Elements are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Second Array Elements are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
}