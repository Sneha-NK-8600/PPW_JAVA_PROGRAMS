/* Copy Array Elements into Another Array
Class: ArrayCopy
Functions:
void inputArray(int arr[])
int[] copyArray()
Logic: Loop through source array and store elements into new array. */

import java.util.Scanner;

class CopyArray
{
    void inputArray(int arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
 
    int[] copyArray(int arr[])
    {
      int a[]=new int[arr.length];
      for(int i=0;i<arr.length;i++)
      {
        a[i]=arr[i];
      }
      System.out.println("Original array is:");
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }
    return a;
   }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        CopyArray ca=new CopyArray();

        System.out.println("Enter array Size:");
        int size=sc.nextInt();

        int ar[]=new int[size];

        ca.inputArray(ar);
        int arrcp[]=ca.copyArray(ar);

        System.out.println("Copied array is:");
        for(int i=0;i<arrcp.length;i++)
        {
            System.out.println(arrcp[i]+" ");
        }
    }
}