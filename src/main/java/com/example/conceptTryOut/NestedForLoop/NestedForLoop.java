package com.example.conceptTryOut.NestedForLoop;

public class NestedForLoop {
    public static void main(String[] args) {
        //basic working of nested for loop
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i:" + i + " j:" + j);
            }
        }
        System.out.println("------------------------");

        for(int i=0;i<4;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                System.out.println("i:"+i+" j"+j);
            }
        }

    }
}
