package com.example.conceptTryOut.StringQuestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String string = "aaaabbbccc";
//       Map<Character,Long>charCount=string.chars().mapToObj(c->(char)c)
//               .collect(Collectors.groupingBy((Function.identity()),Collectors.counting()));

//       charCount.forEach((character,count)->{System.out.println(character+": "+count);});

      Map<Character,Long>charCount=string.chars().mapToObj(c->(char)c)
              .collect(Collectors.groupingBy((Function.identity()),Collectors.counting()));

      charCount.forEach((character,count)->{System.out.println(character+": "+count);});


    }
}
