package com.example.conceptTryOut.Interface;

import java.util.function.Predicate;

public class PredicateInterfaceExample2 {
    public static void main(String[] args) {
        Predicate<Integer>pre=a->(a>8);
        Boolean result=pre.test(10);
        System.out.println(result);
    }
}
