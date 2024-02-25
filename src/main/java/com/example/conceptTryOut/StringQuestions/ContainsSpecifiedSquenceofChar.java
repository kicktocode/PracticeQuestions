package com.example.conceptTryOut.StringQuestions;

import org.apache.logging.log4j.message.StringFormattedMessage;

public class ContainsSpecifiedSquenceofChar {
    public static void main(String[] args) {
        String string = "PHP Exercises and Python Exercises";
        System.out.println(string.contains("and"));
        System.out.println("-------------------");

        /// contains are case-sensitive and check for string chunk from given string
        String string1 = "Comparing example.com";
        System.out.println(string1.contains("example.com"));

        String string2 = "Comparing Example.com";
        System.out.println(string2.contains("example.com"));
        System.out.println("-------------------");

        ////ContentEquals checks word to word similarity between two and is case-sensitive

        String str3="example.com";
        System.out.println(str3.contentEquals("example.com"));
        System.out.println(str3.contentEquals("Example.com"));
        System.out.println("-------------------");

        System.out.println(str3.equals("example.com"));
        System.out.println(str3.equals("Example.com"));
    }
}
