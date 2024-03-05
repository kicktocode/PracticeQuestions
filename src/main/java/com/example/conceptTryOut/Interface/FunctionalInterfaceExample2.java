package com.example.conceptTryOut.Interface;
interface square
{
    int calculate(int x);
}
public class FunctionalInterfaceExample2 {
    public static void main(String[] args) {
        int a=5;
        square square = (int x)->x*x;
        System.out.println( square.calculate(4));
    }
}
