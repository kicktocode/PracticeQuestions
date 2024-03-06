package com.example.conceptTryOut.Interface;

interface SaySomething{
    public String say();
}

public class NoParamLambdaExpression {
    public static void main(String[] args) {
        SaySomething saySomething = ()->
        {
            return "Nothing to say";
        };
        System.out.println(saySomething.say());
    }
}
