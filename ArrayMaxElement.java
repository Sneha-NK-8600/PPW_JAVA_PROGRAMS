/* Find Maximum Element in Array
Class: ArrayMax 
Functions:
void inputArray(int arr[]) → take array input
int findMax() → display maximum element
int findMin() → display minimum element
Logic: Loop through array, compare each element, store max. */

import java.util.Scanner;

class ArrayMaxMinElement
{

        void inputArray()
         {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter Array Size: ");
            int size=sc.nextInt();

            int arr[]=new int[size];

            System.out.println("Enter Array Elememts:");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
         }


    public static void main(String args[])
    {
        

    }
}