package com.mywork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ksharma on 6/4/15.
 */
public class test1 {
    static int solveMeFirst(int a, int b) {
        return a+b;
    }


    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        //System.out.println(sum);

        int[] array;
        array = new int[100];

        array[0] = 100;

        System.out.println(array[0]);

        //copy();

        //System.out.println(a^b);


    }

    public static void copy(){

        int[] arr = {1,2,3,4,5};

        int[] copied = new int[10];

        System.out.println(Arrays.toString(arr));
        System.arraycopy(arr, 0, copied, 1, 5);//5 is the length to copy

        System.out.println(Arrays.toString(copied));

        int[] copied2 = Arrays.copyOf(arr, 10); //10 the the length of the new array
        System.out.println(Arrays.toString(copied2));

        copied2 = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(copied2));
    }


}
