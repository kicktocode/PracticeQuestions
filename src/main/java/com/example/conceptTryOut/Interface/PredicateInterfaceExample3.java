package com.example.conceptTryOut.Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceExample3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Geek", "Check", "Greek");
        //method 1
        strings.stream().filter(e -> e.startsWith("G")).forEach(System.out::println);

        //method 2
        Predicate<String> p = (s) -> s.startsWith("G");

        // Iterate through the list
        for (String st : strings) {
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }
    }
}