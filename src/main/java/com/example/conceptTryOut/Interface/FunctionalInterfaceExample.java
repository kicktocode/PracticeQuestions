package com.example.conceptTryOut.Interface;
//creating inner class ,this was used before java 8 ,now outdated
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread running");
            }
        }).start();
    }
}
