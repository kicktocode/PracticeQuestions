package com.example.conceptTryOut.Interface;

interface Sayable{
    public String say(String name);
}
public class SingleParamLambdaExpression {
    public static void main(String[] args) {
        Sayable sayable=(name)->{
           return "Hello"+  name;
        };
        System.out.println(sayable.say(" Mona"));
        System.out.println(sayable.say(" Lona"));

        // You can omit function parentheses  same as above seperate object not required to add arguments
        Sayable sayable1=name -> {
            return "Hello"+name;
        };
        System.out.println(sayable1.say(" Sona"));
    }

}
