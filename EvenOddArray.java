import java.util.Scanner;

class EvenOddArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array  size:");
        int size=sc.nextInt();

         int arr[]=new int[size];

       System.out.println("Enter " + size + " Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]+" Even");
            }
            else{
                System.out.println(arr[i]+" Odd");
            }
        }
    }
}