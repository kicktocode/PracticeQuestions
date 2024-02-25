package com.example.conceptTryOut.StringQuestions;
//Write a Java program to create a distinct identifier for a given string.
public class CreateDistinctIdentifier {
    public static void main(String[] args) {
        String string = "Java exercise";
        int hashcode=string.hashCode();
        System.out.println(hashcode);

    }
}
