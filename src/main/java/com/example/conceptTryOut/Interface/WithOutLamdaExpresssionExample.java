package com.example.conceptTryOut.Interface;

interface Drawable{
    public void draw();
}


public class WithOutLamdaExpresssionExample {
    public static void main(String[] args) {
        int width=5;
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing width "+width);
            }
        };
           drawable.draw();
    }
}
