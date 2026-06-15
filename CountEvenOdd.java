/* Count Even and Odd Numbers
Class: ArrayEvenOdd
Functions:
void inputArray(int arr[])
int countEven()
int countOdd()
Logic: Use % 2 == 0 check. */

import java.util.Scanner;

class CountEvenOdd
{
    void inputArray(int arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    int countEven(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
               count++; 
            }
        }
        return count;
    }
    
    int countOdd(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
               count++; 
            }
        }
        return count++;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        CountEvenOdd ceo=new CountEvenOdd();

        System.out.println("Enter array size:");
        int size=sc.nextInt();

        int a[]=new int[size];

        ceo.inputArray(a);
    
        System.out.println("Count of even numbers in array is: "+ceo.countEven(a));
        System.out.println("Count of odd numbers in array is: "+ceo.countOdd(a));


    }
}