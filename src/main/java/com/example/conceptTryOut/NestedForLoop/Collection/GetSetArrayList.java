package com.example.conceptTryOut.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GetSetArrayList {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("erty");
        list.add("fghj");
        list.add("erfgh");

        Iterator<String> itr= list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("Get demo at index one :"+list.get(1));
        System.out.println("set demo at index two :"+list.set(2,"qwerty"));
        System.out.println(list);
    }
}
