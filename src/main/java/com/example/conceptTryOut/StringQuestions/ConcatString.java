package com.example.conceptTryOut.StringQuestions;
//Write a Java program to concatenate a given string to the end of another string.
public class ConcatString {
    public static void main(String[] args) {
        String str1="PHP Exercises and";
        String str2=" Python Exercises";
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(str1).append(str2));

        String str3=str1.concat(str2);
        System.out.println(str3);
    }
}
