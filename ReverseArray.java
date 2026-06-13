import java.util.Scanner;

class ReverseArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array size:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        
       System.out.println("Enter " + size + " Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int last=arr.length-1;
        int start=0;

        while(start<last)
        {
            int temp = arr[start];
			arr[start] = arr[last];
			arr[last] = temp;
			
			start++;
			last--;
        }

        System.out.println("Reverse of an array is:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

    }
}