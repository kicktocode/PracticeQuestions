package com.example.conceptTryOut.StringQuestions;

import java.util.Arrays;

public class CheckParenthesis {
    public static void main(String[] args) {
        String arr="[()]{}{[()()]()}";
        char[] chars =arr.toCharArray();
        int size=chars.length;
        System.out.println(size);
        if(size%2!=0)
        {
            System.out.println("unbalanced parenthesis");
        }
        else {
            System.out.println("balanced parenthesis");
        }
    }
}
