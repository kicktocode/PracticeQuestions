package com.example.conceptTryOut.StringQuestions;

public class GetIndexOfCharacter {
    public static void main(String[] args) {
        String string = "The quick brown fox jumps over the lazy dog";
        char[] str=string.toCharArray();
        for(int i=0;i< str.length;i++)
        {
            System.out.println(str[i]+" index");
        }
    }
}
