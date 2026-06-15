/* Search an Element in Array
Class: ArraySearch
Functions:
void inputArray(int arr[])
boolean searchElement(int key)
Logic: Traverse array, check if key matches any element. */

import java.util.Scanner;

class SerachElement
{
    
    void inputArray(int arr[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

   boolean searchElement(int arr[],int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==key)
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        SerachElement search = new SerachElement();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int a[] = new int[size];

        search.inputArray(a);

        System.out.println("Enter element to find:");
        int ele=sc.nextInt();


        boolean result = search.searchElement(a,ele);

       if(result == true)
       {
        System.out.println("Element found in array");
       }
       else
       {
        System.out.println("Element not found in array");
       }
    }
}