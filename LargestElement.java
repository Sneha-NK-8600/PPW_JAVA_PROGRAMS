import java.util.Scanner;

class LargestElement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        int max=arr[0];

        System.out.println("Enter " + size + " Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Largest Element in Array is: "+max);
    }
}