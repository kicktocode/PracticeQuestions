package com.example.conceptTryOut.StringQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[]arr= {2,2,3,3,7,5};
        Set<Integer>set = new HashSet<>();
        for(int num:arr)
        {
            set.add(num);
        }
        System.out.println(set);
    }
}
