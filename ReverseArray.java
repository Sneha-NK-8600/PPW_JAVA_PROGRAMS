/* Reverse the Array
Class: ArrayReverse
Functions:
void inputArray(int arr[])
void reverseArray() */

import java.util.Scanner;

class ReverseArray
{
    void inputArray(int arr[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Elements:");
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    void reverseArray(int arr[])
    {
        int start = 0;
        int last = arr.length - 1;

        while(start < last)
        {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;

            start++;
            last--;
        }

        System.out.println("Reversed Array is:");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ReverseArray rs = new ReverseArray();

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int a[] = new int[size];

        rs.inputArray(a);
        rs.reverseArray(a);
    }
}