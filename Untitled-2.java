/* Write a Java program to find sum of all elements in a 2D array.
Example

Input:

1 2
3 4

Output:

Sum = 10 */

import java.util.Scanner;

class SumOf2DArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of row");
        int row=sc.nextInt();

        System.out.println("Enter size of column");
        int col=sc.nextInt();

        int arr[][]=new int[row][col];
        
        System.out.println("Enter Array elements:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }
    }
}
