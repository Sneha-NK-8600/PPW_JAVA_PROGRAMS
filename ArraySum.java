/* Calculate Sum of Array Elements
Class: ArraySum
Functions:
void inputArray(int arr[])
int calculateSum()
Logic: Traverse array and add all values to sum. */

import java.util.Scanner;

class ArraySum
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

    int calculateSum(int arr[])
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args)
    {
        ArraySum aSum = new ArraySum();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int a[] = new int[size];

        aSum.inputArray(a);

        int result = aSum.calculateSum(a);

        System.out.println("The sum of the array elements is: " + result);
    }
}