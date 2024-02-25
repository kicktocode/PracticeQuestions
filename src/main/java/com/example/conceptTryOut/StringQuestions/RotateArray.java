package com.example.conceptTryOut.StringQuestions;

import java.util.Arrays;



public class RotateArray {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int k=2;
        rotateArray(arr,k);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }

    private static void rotateArray(int[] arr, int k) {
        int n= arr.length;
       reverse(arr,0,k-1);
       reverse(arr,k,n-1);
       reverse(arr,0,n-1);

    }
    private static void reverse(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }
    }
}
