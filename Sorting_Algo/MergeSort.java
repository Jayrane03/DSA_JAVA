package Sorting_Algo;

import java.util.Arrays;
import java.util.Scanner;
//Time complexity =  O(nlog n)
public class MergeSort {

    public static void divide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    public static void conquer(int arr[], int start, int mid, int end) {
        int mergeArr[] = new int[end - start + 1];

        int index1 = start;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= end) {
            if (arr[index1] <= arr[index2]) {
                mergeArr[x++] = arr[index1++];
            } else {
                mergeArr[x++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            mergeArr[x++] = arr[index1++];
        }
        while (index2 <= end) {
            mergeArr[x++] = arr[index2++];
        }

        for (int i = 0, j = start; i < mergeArr.length; i++, j++) {
            arr[j] = mergeArr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt(); // Fix: Declare `n` before using it

        int[] arr = new int[n]; // Fix: Proper array declaration
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Fix: Correct way to take input
        }

        sc.close(); // Fix: Close scanner to prevent memory leaks

        divide(arr, 0, n - 1);

        System.out.println("Sorted Array using Merge Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
