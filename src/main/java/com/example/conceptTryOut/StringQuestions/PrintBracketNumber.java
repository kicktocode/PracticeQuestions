package com.example.conceptTryOut.StringQuestions;

import java.util.Arrays;

public class PrintBracketNumber {
    public static void main(String[] args) {
        String str = "(aa(bdc))p(dee)";
        char[] chars = str.toCharArray();

       int count=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
             count++;
                System.out.println(count);
            }
            else if (chars[i] == ')') {
                System.out.println(count);
               count--;
            }

        }


    }
}
