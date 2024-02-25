package com.example.conceptTryOut.StringQuestions;
//Given an array A of n non negative numbers.
//        The task is to find the first equilibrium point in an array.
//        Equilibrium point in an array is an index(or position)such
//        that the sum of all elements before that index is same as sum of elements after it.
public class EquilibirumPoint {
    public static void main(String[] args) {
        int []arr={1,3,5,2,2};
        for(int i=0;i< arr.length;i++)
        {
            int leftSum=0;
            for(int j=0;j<i;j++)
            {
                leftSum=leftSum+arr[j];
            }
            int rightSum=0;
            for(int j=i+1;j< arr.length;j++)
            {
                rightSum=rightSum+arr[j];
            }

            if(rightSum==leftSum)
            {  System.out.println(i+1);
                break;
            }

        }
    }
}
