package com.example.conceptTryOut.StringQuestions;

import java.util.Arrays;

public class CheckVowel {
    public static void main(String[] args) {
        String string = "rty";
      boolean str=string.chars().anyMatch(c->"aeoiuAEIOU".indexOf(c)==1);
        System.out.println(str);
    }
}
