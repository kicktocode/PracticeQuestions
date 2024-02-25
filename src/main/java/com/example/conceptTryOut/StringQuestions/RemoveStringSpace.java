package com.example.conceptTryOut.StringQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveStringSpace {
    public static void main(String[] args) {
        String string = "geeks for geeks";
        System.out.println(string);
        char[] str = string.toCharArray();
        moveRight(str);
        String result=new String(str);
        System.out.println(result);
    }

    private static void moveRight(char[] str) {
        int writePointer=str.length-1;
        for(int readPointer= str.length-1;readPointer>=0;readPointer--)
        {
            if(str[readPointer]!=' ')
            {
                str[writePointer]=str[readPointer];
                writePointer--;
            }
        }
        while (writePointer>=0)
        {
            str[writePointer]=' ';
            writePointer--;
        }

    }
}
