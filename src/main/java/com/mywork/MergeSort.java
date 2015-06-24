package com.mywork;

/**
 * Created by ksharma on 6/15/15.
 *
 * Merge sort by recursion.
 * Big O(nlogn)
 */
public class MergeSort {

    public static int[] intArray;
    public static int[] helpArray;

    public static int arrayLen;

    public static void main(String args[]) {
        intArray = new int[]{25, 35, 5, 10, 17, 1098, 220, 62872, 882, 12, 10, 22, 1182, 11, 12, 5, 12};
        arrayLen = intArray.length;
        helpArray = new int[arrayLen];
        mergeSort(0, arrayLen - 1);

        for(int i=0; i< arrayLen; i++) {
            System.out.print(" " + intArray[i]);
        }
    }

    public static void mergeSort(int low, int high) {

        if (low < high) {
            int middle = (low + high) / 2;
            System.out.println("low : " + low);
            System.out.println("high : " +high);
            System.out.println("middle : " +middle);
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            doMerge(low, middle, high);
        }
    }

    public static void doMerge(int low, int middle, int high) {

        for(int m =0; m <= high; m++){
            helpArray[m] = intArray[m];
            //System.out.println("helpArray : " +helpArray[m]);
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helpArray[i] <= helpArray[j]) {
                intArray[k] = helpArray[i];
                i++;
            } else {
                intArray[k] = helpArray[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            intArray[k] = helpArray[i];
            k++;
            i++;
        }

        for(int m=0; m< arrayLen; m++) {
            System.out.print(" " + intArray[m]);
        }
        System.out.println("");

    }
}
