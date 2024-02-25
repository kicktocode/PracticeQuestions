package com.example.conceptTryOut.StringQuestions;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String string = "i.like.this.program.very.much";
        String[] words = string.split("\\.");
        System.out.println(Arrays.toString(words));
        StringBuilder stringBuilder=new StringBuilder();
        for(int i= words.length-1;i>=0;i--)
        {
            stringBuilder.append(words[i]);
            if(i!=0)
            {
                stringBuilder.append(".");
            }

        }
        System.out.println(stringBuilder);
    }
}