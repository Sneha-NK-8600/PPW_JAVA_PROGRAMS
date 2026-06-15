/* Find Maximum Element in Array
Class: ArrayMax 
Functions:
void inputArray(int arr[]) → take array input
int findMax() → display maximum element
int findMin() → display minimum element
Logic: Loop through array, compare each element, store max. */

import java.util.*;

public class ArrayMinMaxElement {

    void inputArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    int findMin(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) 
    {
        ArrayMinMaxElement obj = new ArrayMinMaxElement();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();

        int[] arr = new int[size];

        obj.inputArray(arr);
        
        System.out.println("Maximun element in array is: " + obj.findMax(arr));
        System.out.println("Minimum element in array is:  " + obj.findMin(arr));

    }

}