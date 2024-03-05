package com.example.conceptTryOut.Interface;
interface draw{
    public void drawing();
}

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        int width=5;
        draw draw = ()-> {
            System.out.println("Drawing width" + width);
        };
        draw.drawing();
    }
}
