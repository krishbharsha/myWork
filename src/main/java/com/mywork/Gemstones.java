package com.mywork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by ksharma on 6/9/15.
 */
public class Gemstones {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        HashMap<Character, Integer> gem = new HashMap();
        int val = 0;
        boolean first = true;

        while (tests > 0 && tests < 101) {
            String str = scan.next();

            if (str.length() > 0 && str.length() < 101) {
                if (first) {
                    for (int m = 0; m < str.length(); m++) {
                        int alpha = (int) str.charAt(m);
                        if (alpha > 96 && alpha < 123) {
                            gem.put(str.charAt(m), val);
                        } else break;
                    }
                    first = false;
                } else {
                    for (int m = 0; m < str.length(); m++) {
                        int alpha = (int) str.charAt(m);
                        if (alpha > 96 && alpha < 123 && gem.containsKey(str.charAt(m))) {
                            gem.put(str.charAt(m), val);
                        } else if (alpha < 97 || alpha > 122) {
                            break;
                        }
                    }
                }
            }
            Iterator<Character> iter = gem.keySet().iterator();
            while (iter.hasNext()) {
                char key = iter.next();
                if (val != gem.get(key)) {
                    iter.remove();
                }
            }
            val++;
            tests--;
        }
        System.out.println(gem.size());
    }
}
