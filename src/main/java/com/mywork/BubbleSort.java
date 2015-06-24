package com.mywork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ksharma on 6/13/15.
 * <p>
 * Big O(n^2) ... n(n-1)/2.  swap is n^2.
 */
public class BubbleSort {

    public static int[] intArray;

    public static void main(String args[]) {

//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        String newLine = "";
//
//        try {
//            newLine = bufferedReader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.print(newLine);

        intArray = new int[]{25, 35, 5, 10, 17, 1098, 220, 62872, 882, 12, 10, 22, 1182, 11, 12, 5, 12};

        bubbleSort();

    }

    public static void bubbleSort() {

        int len = intArray.length;

        while (len > 1) {
            for (int m = 0; m < len - 1; m++) {

                if (intArray[m] > intArray[m + 1]) {
                    intArray[m] = intArray[m] ^ intArray[m + 1];
                    intArray[m + 1] = intArray[m] ^ intArray[m + 1];
                    intArray[m] = intArray[m] ^ intArray[m + 1];
                }
            }
            len--;
        }

        for (int n = 0; n < intArray.length; n++) {
            System.out.print(intArray[n] + " ");
        }
    }


}
