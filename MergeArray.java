
/* Merge Two Arrays
Write a program to merge two arrays into a single array.
Example: Array1: [1, 2, 3] Array2: [4, 5, 6] Output: [1, 2, 3, 4, 5, 6] */

import java.util.Scanner;

class MergeArray
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter Size of First Array:");
    int s1=sc.nextInt();
    int arr1[]=new int[s1];
    System.out.println("Enter First Array Elements:");
    for(int i=0;i<s1;i++)
     {
       arr1[i]=sc.nextInt();
     }

     System.out.println("Enter Size of Second Array:");
     int s2=sc.nextInt();
     int arr2[]=new int[s2];
     System.out.println("Enter Second Array Elements:");
     for(int j=0;j<s2;j++)
     {
      arr1[j]=sc.nextInt();
     }
     
   int s3=arr1.length+arr2.length;
   int arr3[]=new int[s3];

   for(int k=0;k<s1;k++)
   {
    arr3[k]=arr1[k];
   }
   for(int k=0;k<s2;k++)
   {
    arr3[arr1.length+k]=arr2[k];
   }
   
   System.out.println("Merging Two Arrays:");
   for(int i=0;i<s3;i++)
   {
    System.out.print(arr3[i]+" ");
   }
}
}