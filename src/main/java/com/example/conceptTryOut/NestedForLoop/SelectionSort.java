package com.example.conceptTryOut.NestedForLoop;

import java.util.Arrays;

public class SelectionSort {
    void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int arr[] = {2, 5, 7, 8, 9, 4, 5, 6};
        System.out.println("Unsorted Array" + Arrays.toString(arr));
        obj.sort(arr);
        System.out.println("Sorted array :");
        obj.printArray(arr);
    }
}
