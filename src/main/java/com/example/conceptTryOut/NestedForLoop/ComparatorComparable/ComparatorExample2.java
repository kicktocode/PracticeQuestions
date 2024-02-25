package com.example.conceptTryOut.ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    int age;


    public Employee(String name, int age) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Main1 {
    public static void main(String[] args) {
        List<Employee>list = new ArrayList<>();
        list.add(new Employee("Rohit",45));
        list.add(new Employee("Dhoni",40));
        list.add(new Employee("Nehwal",35));
        list.add(new Employee("Jadega",38));
        System.out.println("List of Employee detail before sorting");

        for(Employee employee:list)
        {
            System.out.println(employee);
        }
        System.out.println("__________________________");

        System.out.println("list sortion based on age: ");
        Collections.sort(list,new sortByAge());
        System.out.println(list);
        System.out.println("__________________________");

        System.out.println("list sortion based on name: ");
        Collections.sort(list,new sortByName());
        System.out.println(list);
        System.out.println("__________________________");

        System.out.println("list reverse sortion based on name: ");
        Collections.sort(list,new sortByAgeReverse());
        System.out.println(list);
        System.out.println("__________________________");
    }

    static class sortByAge implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.age-o2.age;
        }

    }

    static class sortByName implements Comparator<Employee>
    {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    static class sortByAgeReverse implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o2.age-o1.age;
        }

    }

}
