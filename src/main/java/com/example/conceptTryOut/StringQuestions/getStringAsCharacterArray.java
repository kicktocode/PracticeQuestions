package com.example.conceptTryOut.StringQuestions;

public class getStringAsCharacterArray {
    public static void main(String[] args) {
        String string = "[C@2a139a55";
        char[] str=string.toCharArray();
        for(char c:str)
        System.out.print(c+" ");
    }
}
