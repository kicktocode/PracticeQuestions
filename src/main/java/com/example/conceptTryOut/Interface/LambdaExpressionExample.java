package com.example.conceptTryOut.Interface;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("Thread running");
        }).start();

    }
}
