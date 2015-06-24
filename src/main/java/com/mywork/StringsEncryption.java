package com.mywork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ksharma on 6/9/15.
 */
public class StringsEncryption {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String string = scan.next();
        int strLen = string.length();
        Double sqrt;
        int a, b;

        if (strLen > 0 && strLen < 82) {
            sqrt = Math.sqrt(strLen);

            a = (int) Math.floor(sqrt);
            b = (int) Math.ceil(sqrt);

            if (a * b < strLen) {
                a = b;
            }

            char[][] dimArray = new char[a][b];
            int count = 0;

            for (int m = 0; m < a; m++) {
                for (int n = 0; n < b; n++) {
                    if (count < strLen) {
                        dimArray[m][n] = string.charAt(count);
                        count++;
                    }
                }
            }

            for (int n = 0; n < b; n++) {
                for (int m = 0; m < a; m++) {
                    if(dimArray[m][n] != 0) {
                        System.out.print(dimArray[m][n]);
                    }
                }
                System.out.print(" ");
            }

        }

    }
}
