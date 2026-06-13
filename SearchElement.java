import java.util.Scanner;

class SearchElement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

    System.out.println("Enter size of an array:");
    int size=sc.nextInt();

    int arr[]=new int[size];

    int flag=0;

    System.out.println("Enter array elements:");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }

    System.out.println("Enter element to found");
    int num=sc.nextInt();

    for(int i=0;i<size;i++)
    {
        if(arr[i]==num)
        {
            flag=1;
            break;
        }
    }

    if(flag==1)
    {
       System.out.println("Element found"); 
    }
    else 
    {
        System.out.println("Element not found");
    }
    }
    
}