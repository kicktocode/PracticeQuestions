package com.example.conceptTryOut.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingCollectionTypes {
    public static void main(String[] args) {
       List<String> list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        //using iterator
        Iterator itr= list.iterator();
        while (itr.hasNext())
        {
            System.out.println("using iterator:"+itr.next());
        }

        //using for loop
        for(int i=0;i< list.size();i++)
        {
            System.out.println("using for loop"+ list.get(i));
        }

        //using forEachLoop
        for(String names:list)
        {
            System.out.println("using for each loop:"+names);
        }

        //using stream
        list.stream().forEach(l-> System.out.println(l));
    }
}
