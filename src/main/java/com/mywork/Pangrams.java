package com.mywork;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ksharma on 6/8/15.
 */
public class Pangrams {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> alpha = new HashMap();

        String sen = scan.nextLine();

        scan.nextBigDecimal();

        String[] str = new String[10];

        int len = str.length;

        float a =0f;

        int[] intArray = new int[10];

        int len1 = intArray.length;


        for (int m = 0; m < sen.length(); m++) {

            if (alpha.size() != 27) {
                alpha.put(String.valueOf(sen.charAt(m)).toLowerCase(), 1);
            } else break;
        }

        if (alpha.size() == 27) {
            System.out.println("pangram");
        } else
            System.out.println("not pangram");
    }
}
