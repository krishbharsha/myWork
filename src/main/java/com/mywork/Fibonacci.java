package com.mywork;

import java.util.Scanner;

/**
 * Created by ksharma on 6/7/15.
 */
public class Fibonacci {

    static long a = 0, b = 1, c = 0;

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the count value");
        int count = scan.nextInt();
        System.out.println("Fibonacci values : ");
        long startTime = System.nanoTime();
        fibValueRec(count);
        long endRec = System.nanoTime();
        //fibValue(count);
        //long endIter = System.nanoTime();

        System.out.println(" end time " + (endRec - startTime));
        //System.out.println(endIter - startTime);
    }

    public static void fibValueRec(int count) {

        if (count != 0) {
            System.out.println(a);
            c = a;
            a = a + b;
            b = c;
            fibValueRec(count - 1);
        }

    }

    public static void fibValue(int count) {

        a = 0;
        b = 1;
        c = 0;
        for (int m = 0; m < count; m++) {
            System.out.println(a);
            c = a;
            a = a + b;
            b = c;
        }
    }
}
