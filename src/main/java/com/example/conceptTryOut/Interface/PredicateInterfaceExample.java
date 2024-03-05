package com.example.conceptTryOut.Interface;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

        static Boolean checkAge(int age)
        {
            if(age>17)
                return true;
            else return false;
        }
    public static void main(String[] args) {
            //using predicate interface
        Predicate<Integer>predicate=PredicateInterfaceExample::checkAge;
        //calling predicate interface
        Boolean result=predicate.test(25);
        System.out.println(result);


    }
}
