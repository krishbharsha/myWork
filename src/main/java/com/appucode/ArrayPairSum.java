package com.appucode;

/**
 * Created by ksharma on 7/5/15.
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPairSum {
    public static void getPairs(int[] arr, int sum) {
        if (arr.length == 0) return;

        Set<Integer> set = new HashSet();
        for (int i : arr) {
            if (set.contains(sum - i)) {
                System.out.println("Values are: " + i + " " + (sum - i));
                set.remove(sum-i);
            }
            else{
                set.add(i);
            }
        }
    }

    public static void getPairs1(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int count = 0;
        while (i < j) {
            if (arr[i] + arr[j] > k)
                j--;
            else if (arr[i] + arr[j] < k)
                i++;
            else {
                System.out.println(arr[i] + ":" + arr[j]);
                j--;
                i++;
                count++;
            }
        }
        System.out.println("Count is: " + count);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 20, 25, 25, 45 };
        getPairs(arr, 50);
        getPairs1(arr, 50);
    }
}
