/* Count Frequency of Each Element
Class: ArrayFrequency
Functions:
void inputArray(int arr[])
void countFrequency()
Logic: For each element, count how many times it appears using nested loop. */

import java.util.Scanner;

class countFrequency
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

    void countFrequency(int arr[])
    {
      int  count=0;
      for(int i=0;i<arr.length;i++)
      {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
            }
        }
      }
      System.out.println("The frequency of "+arr[i]+" is:"+count);
    }

    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);

      countFrequency cf=new countFrequency();

      System.out.println("Enter array size:");
      int size=sc.nextInt();
      
      int a[]=new int[size];

      cf.inputArray(a);
      cf.countFrequency(a);
    }
}