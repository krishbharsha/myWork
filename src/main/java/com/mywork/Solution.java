package com.mywork;
import java.util.Scanner;

public class Solution {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int size = ar.length;
        int num = ar[size-1];

        for (int i = size-2; i >=0; i--){
            if (num < ar[i]){
                ar[i+1] = ar[i];
                printArray(ar);
            } else {
                ar[i+1] = num;
                printArray(ar);
                break;
            }
        }
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }


}
 
