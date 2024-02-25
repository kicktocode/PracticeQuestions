package com.example.conceptTryOut.StringQuestions;

import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest {
    public static void main(String[] args) {
        int [] arr={1,4,7,8};
        Arrays.sort(arr);
        for(int i= arr.length-1;i>=0;i--)
        {
           if(arr[arr.length-1]!= arr.length-2)
           {
               System.out.println(arr[arr.length-2]);
               break;
           }
           else
               System.out.println("-1");

        }
        }

    }

