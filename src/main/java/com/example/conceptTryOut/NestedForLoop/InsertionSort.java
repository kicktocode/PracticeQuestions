package com.example.conceptTryOut.NestedForLoop;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

    class Main1 {
        public static void main(String[] args) {
            InsertionSort obj = new InsertionSort();
            int arr[] = {4, 5, 7, 1, 2, 7, 8, 9, 10};
            System.out.println("Original or unsorted array:    " + Arrays.toString(arr));
            obj.sort(arr);
            obj.printArray(arr);
        }
    }

