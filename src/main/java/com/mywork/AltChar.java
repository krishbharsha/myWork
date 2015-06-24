package com.mywork;

import java.util.Scanner;

/**
 * Created by ksharma on 6/9/15.
 */
public class AltChar {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int tests = scan.nextInt();
        int count = 0;

        if (tests < 11) {
            while (tests != 0) {
                String alt = scan.next();
                for (int m = 0; m < (alt.length() - 1); m++) {
                    if (alt.charAt(m) == alt.charAt(m + 1)) {
                        count++;
                    }
                }
                System.out.println(count);
                tests--;
                count = 0;
            }
        }
    }
}
