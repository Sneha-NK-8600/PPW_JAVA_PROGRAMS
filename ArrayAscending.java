import java.util.Scanner;

class ArrayAscending
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        int temp;
        
       System.out.println("Enter " + size + " Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Reverse of an array is:");
        for(int i=0;i<size;i++)
        {
            for(int j=1;j<size;j++)
            {
                 if(arr[i]>arr[j])
                    {
                      temp=arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
                    }
            }
    
        }

        System.out.println("Array elements in ascending order: ");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

    }
}