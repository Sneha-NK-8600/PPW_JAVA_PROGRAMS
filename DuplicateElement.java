
/* Find Duplicate Elements
Write a program to print duplicate elements in an array.
Example: Input: [1, 2, 3, 2, 4, 1] Output: 1 2 */

import java.util.Scanner;

class DuplicateElement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Size:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("Enter Array Elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array Elements are:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Duplicate elements are:");
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                   System.out.println(arr[i]);
                }
                
            }
        }
    }
}