/* Calculate Average of Array Elements
Class: ArrayAverage
Functions:
void inputArray(int arr[])
double findAverage()
Logic: Use sum ÷ total elements. */

import java.util.Scanner;

class ArrayAverage
{
    
    void inputArray(int arr[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of  array:");

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    int findAverage(int arr[])
    {
        int sum = 0;
        int avg=0;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            avg=(sum/arr.length);
        }

        return avg;
    }

    public static void main(String[] args)
    {
        ArrayAverage aavg= new ArrayAverage();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int a[] = new int[size];

        aavg.inputArray(a);

        int result = aavg.findAverage(a);

        System.out.println("The average of the array elements is: " + result);
    }
}