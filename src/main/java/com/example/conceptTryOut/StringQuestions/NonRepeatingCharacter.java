package com.example.conceptTryOut.StringQuestions;


//Given a string S consisting of lowercase Latin Letters.
// Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

import java.util.LinkedHashMap;


public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String string = "zxvczbtxyzvy";
        LinkedHashMap<Character, Integer> str = new LinkedHashMap<>();
        for (char s : string.toCharArray()) {
            if (str.containsKey(s)) {
                int existingCount = str.get(s);
                str.put(s, existingCount + 1);
            } else {
                str.put(s, 1);
            }
        }
        char firstNonRepeatingCh = '\0';
        for (Character ch : str.keySet()) {
            if (str.get(ch) == 1) {
                firstNonRepeatingCh = ch;
                break;
            }
        }
        if (firstNonRepeatingCh == '\0') {
            System.out.println("First non repeating not present in the input");
        } else {
            System.out.println("First non repeating character = " + firstNonRepeatingCh);
        }
    }
}
