package com.example.conceptTryOut.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String>set = new HashSet<>();
        set.add("tyu");
        set.add("ghj");
        set.add("hjk");
        set.add("tyu");

        Iterator<String >itr= set.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
