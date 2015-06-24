package com.mywork;

/**
 * Created by ksharma on 6/12/15.
 */
public class test2 {

    public static void main (String args[]){

        int[] intArray = new int[10];

        for (int m=0; m<intArray.length; m++){
            intArray[m] = m*10;
        }

        for (int n =0; n<intArray.length; n++){
            System.out.println(intArray[n]);
        }


    }
}
