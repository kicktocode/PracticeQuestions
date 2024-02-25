package com.example.conceptTryOut.StringQuestions;

import java.util.Arrays;


class FindDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2,5, 5, 7};
        Arrays.sort(arr);
        boolean duplicatefound = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                duplicatefound = true;
            }

        }

        if (!duplicatefound) {
            System.out.println("-1");
        }
    }
}
