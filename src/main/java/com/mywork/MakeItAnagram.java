package com.mywork;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ksharma on 6/9/15.
 */
public class MakeItAnagram {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();

        HashMap<Character, Integer> strMap1 = new HashMap();
        HashMap<Character, Integer> strMap2 = new HashMap();

        int strLen1 = str1.length(), strLen2 = str2.length();
        int val;
        int count = 0;

        if ((strLen1 > 0 && strLen2 < 10001) && (strLen2 > 0 && strLen2 < 10001)) {

            for (int m = 0; m < strLen1; m++) {
                val = 1;
                if (str1.charAt(m) > 96 && str1.charAt(m) < 123) {
                    if (strMap1.containsKey(str1.charAt(m))) {
                        val = strMap1.get(str1.charAt(m));
                        val++;
                    }
                    strMap1.put(str1.charAt(m), val);
                }
            }

            for (int m = 0; m < strLen2; m++) {
                val = 1;
                if (str2.charAt(m) > 96 && str2.charAt(m) < 123) {
                    if (strMap1.containsKey(str2.charAt(m))) {
                        if (strMap2.containsKey(str2.charAt(m))) {
                            val = strMap2.get(str2.charAt(m));
                            val++;
                        }
                        strMap2.put(str2.charAt(m), val);
                    }
                }
            }

            for (char key : strMap2.keySet()) {
                if (strMap2.get(key) > strMap1.get(key)) {
                    count = count + strMap2.get(key);
                } else
                    count = count + strMap1.get(key);
            }

            count = count * 2;

            count = (strLen1 + strLen2) - count;

            System.out.println(count);

        }

    }
}
