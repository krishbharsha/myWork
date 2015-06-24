package com.mywork;

import java.util.Scanner;

/**
 * Created by ksharma on 6/8/15.
 */
public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        for (int n = 0; n < testCases; n++) {
            String input = scan.next();
            int len = input.length();
            int a = 0, b = 0;
            System.out.println(len/2);

            for (int m = 1; m < len / 2; m++) {
                a = Math.abs((int) (input.charAt(m)) - (int) (input.charAt(m - 1)));
                b = Math.abs((int) (input.charAt(len - (m))) - (int) (input.charAt(len - (m + 1))));
            }

            if (a == b) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }

        }
    }
}