package com.mywork;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ksharma on 6/9/15.
 */
public class AnagramOfPalindrome {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        String anag = scan.next();

        HashMap<Character, Integer> palin = new HashMap();

        int val = 0;

        for (int m = 0; m < anag.length(); m++) {
            val = 0;
            if (palin.containsKey(anag.charAt(m))) {
                val = palin.get(anag.charAt(m));
            }
            palin.put(anag.charAt(m), (val + 1));
        }

        Boolean flag = true;
        int count = 0;

        if (anag.length() % 2 == 0) {
            for (char key : palin.keySet()) {
                if (palin.get(key) % 2 != 0) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }

            if (flag) System.out.println("YES");
        } else {
            for (char key : palin.keySet()) {
                if (palin.get(key) % 2 != 0 && count == 1) {
                    System.out.println("NO");
                    flag = false;
                    break;
                } else if (palin.get(key) % 2 != 0) {
                    count++;
                }
            }

            if (flag) System.out.println("YES");
        }

        scan.close();

    }
}
