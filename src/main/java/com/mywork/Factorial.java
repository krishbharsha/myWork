package com.mywork;

import java.util.Scanner;

/**
 * Created by ksharma on 6/7/15.
 */
public class Factorial {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        fact(scan.nextInt());
    }

    static void fact(int val) {

        int total = 1;
        for (int m = 1; m <= val; m++) {
            total = total * m;
        }

        System.out.println("Factorial is : " + total);
    }
}
