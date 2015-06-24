package com.mywork;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ksharma on 6/7/15.
 */
public class ModifiedFibonacci {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int pos = scan.nextInt();

        if ((first >= 0 && first <= 2) && (second >= 0 && second <= 2) && (pos >= 3 && pos <= 20)) {
            modFibValue(first, second, pos);
        }
    }

    public static void modFibValue(int first, int second, int count) {

        BigInteger[] bigArray = new BigInteger[count];

        bigArray[0] = BigInteger.valueOf(first);
        bigArray[1] = BigInteger.valueOf(second);

        for (int m = 2; m < count; m++) {
            bigArray[m] = (bigArray[m - 1].multiply(bigArray[m - 1])).add(bigArray[m - 2]);
        }

        System.out.println(bigArray[count - 1]);

        String name = "yo";

        String dummy = String.format("Yo %s, my %s" , name, name);

        System.out.println(dummy);
    }
}

