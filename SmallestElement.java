import java.util.Scanner;

class SmallestElement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        int min=Integer.MAX_VALUE;
        System.out.println("Enter " + size + " Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest Element in Array is: "+min);
    }
}