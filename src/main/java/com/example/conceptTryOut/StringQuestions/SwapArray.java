package com.example.conceptTryOut.StringQuestions;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println( Arrays.toString(arr));
        for(int i=0;i< arr.length-2;i++)
        {
           int temp=arr[i];
           arr[i]=arr[i+2];
           arr[i+2]=temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
