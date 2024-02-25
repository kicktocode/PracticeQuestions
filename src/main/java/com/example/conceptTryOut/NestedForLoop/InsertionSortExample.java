package com.example.conceptTryOut.NestedForLoop;

import java.util.Arrays;

public class InsertionSortExample {
    void sort(String arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            String key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j].compareTo(key)>0)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
             arr[j+1]=key;
        }
    }
    void printArray(String arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

class Example{
    public static void main(String[] args) {
        InsertionSortExample obj=new InsertionSortExample();
        String arr[]={"cat","bat","apple","dog", "cat"};
        System.out.println(Arrays.asList(arr));
        obj.sort(arr);
        obj.printArray(arr);
    }
}
