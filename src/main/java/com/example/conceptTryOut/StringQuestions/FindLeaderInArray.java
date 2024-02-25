package com.example.conceptTryOut.StringQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLeaderInArray {
    public static void main(String[] args) {
        int arr[]={16, 17, 4, 3, 5, 2};
        List<Integer>result=findLeader(arr);
        System.out.println(result);
    }

    private static List<Integer> findLeader(int[] arr) {
        List<Integer>leader=new ArrayList<>();
        int maxRight= arr[arr.length-1];
        leader.add(maxRight);
        for(int i= arr.length-2;i>0;i--)
        {
             if(arr[i]>=maxRight)

             {
                 maxRight=arr[i];
                 leader.add(maxRight);
             }
        }
        Collections.reverse(leader);
        return leader;
    }
}
