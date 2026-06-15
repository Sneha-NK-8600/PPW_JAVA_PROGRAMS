/* Sort Array in Ascending Order
Class: ArraySort
Functions:
void inputArray(int arr[])
void sortArray()
Logic: Use Bubble Sort / Selection Sort. */

import java.util.Scanner;

class ArraySort
{
    void inputArray(int arr[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter array Elemnts:");
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=sc.nextInt();
       }
    }
    void sortArray(int arr[])
   {
     for(int i=0;i<arr.length;i++)
     {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
     }
     System.out.println("Sorted Array is: ");
     for(int i=0;i<arr.length;i++)
     {
        System.out.println(arr[i]+" ");
     }
   }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      
      ArraySort as=new ArraySort();

      System.out.println("Enter array size: ");
      int size=sc.nextInt();

      int a[]=new int[size];

      as.inputArray(a);
      as.sortArray(a);
    }
}