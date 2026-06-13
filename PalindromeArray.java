 
/* Check Array is Palindrome or Not
Input:
1 2 3 2 1
Output:
Palindrome Array */

import java.util.Scanner;

class PalindromeArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int arr1[] = new int[size];

        System.out.println("Enter Array Elements:");

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
            arr1[i] = arr[i]; // copy original array
        }

        // Reverse arr1
        int start = 0;
        int last = arr1.length - 1;

        while(start < last)
        {
            int temp = arr1[start];
            arr1[start] = arr1[last];
            arr1[last] = temp;

            start++;
            last--;
        }

        boolean isPalindrome = true;

        // Compare arrays
        for(int i = 0; i < size; i++)
        {
            if(arr[i] != arr1[i])
            {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
        {
            System.out.println("Palindrome Array");
        }
        else
        {
            System.out.println("Not Palindrome Array");
        }
    }
}