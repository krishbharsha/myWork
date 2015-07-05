package com.InterviewQ;

/**
 * Created by ksharma on 7/3/15.
 * Given an array of numbers ,
 * replace each number with the product of all the numbers
 * divided by the number at that index without
 * using the division operator
 */
public class MultiplyNoDivide {

    public static void main(String args[]){

        int[] array = new int[] {1,2,3,4,5};

        for(int m=0; m<array.length; m++) {
            System.out.print(" " + array[m]);
        }

        System.out.println();

        array = multipleAllNumbers(array);

        for(int m=0; m<array.length; m++) {
            System.out.print(" " + array[m]);
        }

    }

    // This doesnt work ..
    public static int[] multipleAllNumbers(int[] array) {

        int[][] storeTempResult = new int[array.length][array.length];
        int addedMultiple =1;
        for(int i =0;i<array.length;i++){
            addedMultiple = addedMultiple*array[i];
            storeTempResult[0][i] = addedMultiple;
        }

        for(int i =array.length-1;i>=0;i--){
            addedMultiple = addedMultiple*array[i];
            storeTempResult[i][array.length-1] = addedMultiple;
        }

        for(int i =0;i<array.length-1;i++){
            array[i] = storeTempResult[0][i]*storeTempResult[i+1][array.length-1];
        }

        return array;
    }
}
