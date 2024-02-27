package com.example.conceptTryOut.StringQuestions.Stream;

import java.util.stream.Stream;

public class IterateExample {
    public static void main(String[] args) {
        Stream.iterate(1, e -> e + 1) // start value is 1, with step increase as second functional operator
                .filter(e -> e % 2 == 0)   // only even number will proceed to next step.
                .limit(10)  // only first 10 even numbers will proceed and the stream will be closed.
                .forEach(System.out::println); // simply prints the stream elements.
    }
}
