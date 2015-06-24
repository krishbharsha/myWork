package com.mywork;

/**
 * Created by ksharma on 6/14/15.
 *
 * performance of iteration vs recursion for factorial
 * time taken for recursion is double than iteration
 */
public class FactorialRecIter {

    public static void main(String args[]) {

        long start = System.nanoTime();
        int res = factorialIter(40);
        long end = System.nanoTime();
        long elapsed = end - start;

        System.out.println("Time Iter: " + elapsed);


        long start2 = System.nanoTime();
        int res2 = factorialRec(40);
        long end2 = System.nanoTime();
        long elapsed2 = end2 - start2;

        System.out.println("Time Rec: " + elapsed2);

        foo();
    }

    public static int factorialIter(int num)
    {
        int result = 1;
        if (num <= 1)
            return result;
        while (num > 1)
        {
            result = result * num;
            num--;
        }
        return result;
    }

    public static int factorialRec(int num)
    {
        if (num <= 1)
            return 1;
        return num * factorialRec(num - 1);
    }

    // to demonstrate java.lang.StackOverflowError
    public static void foo(){
        //System.out.println("in the loop");
        //foo();
    }

}
