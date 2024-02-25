package com.example.conceptTryOut.StringQuestions;

public class CompareStringIgnoreCase {
    public static void main(String[] args) {
        String string = "Stephen Edwin King";

        System.out.println(string.equalsIgnoreCase("Walter Winchell"));
        System.out.println(string.equalsIgnoreCase("stephen edwin king"));
    }
}
