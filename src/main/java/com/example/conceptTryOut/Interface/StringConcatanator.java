package com.example.conceptTryOut.Interface;

import java.util.function.BiFunction;

public class StringConcatanator implements BiFunction <String, String, String> {
    @Override
    public String apply(String s, String s2) {
        return s + s2;
    }

    public static void main(String[] args) {
        StringConcatanator stringConcatanator = new StringConcatanator();
        System.out.println(stringConcatanator.apply("asd", "asd"));
    }
}