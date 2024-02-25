package com.example.conceptTryOut.StringQuestions;

public class CreateStringObjectUsingCharArray {
    public static void main(String[] args) {
        String arr[]={"The","book","contains","234","pages"};

        StringBuilder stringBuilder = new StringBuilder();
        for(String Arr:arr)
        {
           stringBuilder.append(Arr+" ");
        }
        System.out.println(stringBuilder.toString());
    }
}
