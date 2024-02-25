package com.example.conceptTryOut.ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        List<student> list = new ArrayList<>();
        list.add(new student("wnk",1));
        list.add(new student("dnk2",2));
        list.add(new student("fnk3",3));
        list.add(new student("bnk4",4));

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
            System.out.println("___________________");
        }

       Collections.sort(list, Comparator.comparing(student::getAge));


        {
            System.out.println("comparing by age:");
            for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
            System.out.println("___________________");
        }

        Collections.sort(list,Comparator.comparing(student::getName));
        {
            System.out.println("comparing by name:");
            for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
            System.out.println("___________________");
        }


    }

}

 class student{
    String name;
    int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "CollectionExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}