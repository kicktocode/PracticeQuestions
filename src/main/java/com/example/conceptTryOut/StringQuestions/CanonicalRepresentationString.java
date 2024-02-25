package com.example.conceptTryOut.StringQuestions;

//Write a Java program to get the Canonical representation of the string object.

public class CanonicalRepresentationString {
    public static void main(String[] args) {
        String str1="Enjoy";
        String str2=new String(str1);
        String str3=str1;
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);




    }
}
