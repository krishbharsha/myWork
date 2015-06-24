package com.mywork;

/**
 * Created by ksharma on 6/13/15.
 *
 * like deck of cards ... sub array sorted and sub array unsorted.
 *
 * O(n^2) .. with swap O(n)
 */
public class InsertionSort {

    public static int[] intArray;

    public static void main(String args[]) {

        intArray = new int[]{25, 35, 5, 10, 17, 1098, 220, 62872, 882, 12, 10, 22, 1182, 11, 12, 5, 12};

        insertionSort();

    }

    public static void insertionSort(){

        int len = intArray.length;
        int temp;

        for(int m=1; m<len; m++){
            for(int n=0; n < m; n++){
                if(intArray[n] > intArray[m]){
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
