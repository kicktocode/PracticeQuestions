package com.example.conceptTryOut.StringQuestions;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 3, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    System.out.println(i + 1);
                    return;
                }


            }
        }
    }
}