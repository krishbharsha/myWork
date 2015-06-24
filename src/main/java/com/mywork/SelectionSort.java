package com.mywork;

/**
 * Created by ksharma on 6/13/15.
 *
 * Big O(n^2). swap is n.
 */
public class SelectionSort {

    public static int[] intArray;

    public static void main(String args[]) {

        intArray = new int[]{25, 35, 5, 10, 17, 1098, 220, 62872, 882, 12, 10, 22, 1182, 11, 12, 5, 12};

        selectionSort();

    }

    public static void selectionSort() {

        int len = intArray.length;
        int temp;

        for (int m = 0; m < len - 1; m++) {
            for (int n = m + 1; n < len; n++) {
                if (intArray[n] < intArray[m]) {
                    temp = intArray[m];
                    intArray[m] = intArray[n];
                    intArray[n] = temp;
                }
            }
        }

        for (int n = 0; n < intArray.length; n++) {
            System.out.print(intArray[n] + " ");
        }
    }
}
