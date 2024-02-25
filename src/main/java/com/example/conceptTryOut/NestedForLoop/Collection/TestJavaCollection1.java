package com.example.conceptTryOut.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestJavaCollection1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("wert");
        list.add("hjk");
        list.add("bnm");
        Iterator itr = list.iterator();
        while ((itr.hasNext())) {
            System.out.println(itr.next());

        }

        List<String> list1 = new LinkedList<>();
        list1.add("wert");
        list1.add("hjk");
        list1.add("bnm");
        Iterator itr1 = list.iterator();
        while ((itr1.hasNext())) {
            System.out.println(itr1.next());

        }

    }
}