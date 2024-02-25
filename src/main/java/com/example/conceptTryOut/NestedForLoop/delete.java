package com.example.conceptTryOut.NestedForLoop;

import java.util.Arrays;

public class delete {
  void sort(int arr[])
  {
      for(int i=1;i<arr.length;i++)
      {
          int key=arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>key)
          {
              arr[j+1]=arr[j];
              j=j-1;
          }
          arr[j+1]=key;
      }
  }
    void printArray(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
class MainDelete
{
    public static void main(String[] args) {
        delete delete = new delete();
        int arr[]={4,7,8,1,4,5,6,2,9};
        System.out.println("Unsorted Array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted Array :");
        delete.sort(arr);
        delete.printArray(arr);
    }
}