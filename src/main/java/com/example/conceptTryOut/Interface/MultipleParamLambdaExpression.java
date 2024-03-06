package com.example.conceptTryOut.Interface;
interface Addition{
     int add(int a,int b);

}
public class MultipleParamLambdaExpression {
    public static void main(String[] args) {
        Addition ad=(a, b) -> {
            return a+b;
        };
        System.out.println( ad.add(50,78));

    }
}
