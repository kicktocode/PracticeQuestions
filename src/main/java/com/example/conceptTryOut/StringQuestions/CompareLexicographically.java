package com.example.conceptTryOut.StringQuestions;


import org.apache.logging.log4j.message.StringFormattedMessage;

//Write a Java program to compare two strings lexicographically.
class CompareLexicographically {
    public static void main(String[] args) {
        String str1 = "this is example1";
        String str2 = "this is example2";
        int result = str1.compareTo(str2);

        if(result<0)
        {
            System.out.println("str1 is smaller");
        } else if (result==0) {
            System.out.println("str1 and str2 are equal");
        }
        else {
            System.out.println("str2 is larger");
        }


        String str3 = "This is example3";
        String str4 = "this is example4";
        int result1 = str3.compareToIgnoreCase(str4);

        if(result1<0)
        {
            System.out.println("str3 is smaller");
        } else if (result1==0) {
            System.out.println("str3 and str4 are equal");
        }
        else {
            System.out.println("str4 is larger");
        }
    }


}
