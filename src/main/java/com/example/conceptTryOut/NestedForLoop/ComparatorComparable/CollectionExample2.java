package com.example.conceptTryOut.ComparatorComparable;

import java.rmi.UnmarshalException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CollectionExample2
{
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("qwe");
        list.add("jk");
        list.add("ertye");
        list.add("cvb");
        list.add("ertyui");

        System.out.println("Unsorted list");
        System.out.println(list);
        System.out.println("...............");
        System.out.println("sorted list");
        Collections.sort(list);
        System.out.println(list);
    }
}