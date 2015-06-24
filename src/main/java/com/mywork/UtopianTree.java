package com.mywork;

import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named UtopianTree. */
        Scanner cycle = new Scanner(System.in);
        int tests = cycle.nextInt();
        if (tests>0 && tests <11){
            for (int i=0; i<tests ; i++){
                int n = cycle.nextInt();
                int growth = 1;

                if(n ==0){
                    growth = 1;
                } else if(n == 1){
                    growth = 2;
                } else if(n == 2){
                    growth = 3;
                } else if(n < 61){
                    int temp = n;
                    if(n%2 == 1){
                        temp = n+1;
                        growth = 0;
                    }
                    for(int k=temp/2;k>0;k--){
                        growth = growth + (int) Math.pow(2, k);
                    }
                }

                System.out.println(growth);
            }
        }
    }
}