package com.example.conceptTryOut.StringQuestions;

public class GetStringAsByteArray {
    public static void main(String[] args) {
        String string = "This is a sample String.";
//        byte[] arr=string.getBytes();
//        String origional=new String(arr);
//        System.out.println(origional);


        byte[]arr=string.getBytes();
        String string1 = new String(arr);
        System.out.println(string1);
    }
}
