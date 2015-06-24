package com.mywork;

import java.util.ArrayList;
import java.util.List;

public class StringProblems {

    public static void anagrams(String soFar, String rest){
        //System.out.println(soFar+ ":" +rest);
        if(rest.length()==0)
            System.out.print(" "+soFar);

        else{
            for(int i = 0; i < rest.length(); i++){
                String rem = rest.substring(0,i) + rest.substring(i+1);
                anagrams(soFar + rest.charAt(i),rem);
            }
        }
    }

    public static void anagrams2(String str) {
        char[] charArr = str.toCharArray();
        getAnagrams(charArr,charArr.length);

    }

    private static void getAnagrams(char[] str , int n) {
        if(n==1){
            System.out.print(" ");
            System.out.print(str);
            return;
        }
        for(int i = 0; i < n; i++){
            swap(str,i,n-1);
            getAnagrams(str,n-1);
            swap(str,i,n-1);
        }
    }


    private static void swap(char[] a, int x, int y) {
        char c = a[x];
        a[x] = a[y];
        a[y] = c;
    }

    public static void arrayAnagrams(int[] arr) {
        getArrAnagrams(arr,arr.length);
    }

    private static void getArrAnagrams(int[] arr, int n) {
        if(n==1) {
            print(arr);
        }
        for(int i = 0; i < n; i++) {
            swapA(arr,i,n-1);
            getArrAnagrams(arr,n-1);
            swapA(arr,i,n-1);
        }
    }

    private static void swapA(int[] a, int x, int y) {
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    private static void print(int[] a) {
        for(int i : a)
            System.out.print(" " + i);
        System.out.println();
    }

    public static void superset(String soFar, String rest){
        if(rest.length()==0)
            System.out.println("soFar : " +soFar);
        else{
            superset(soFar+rest.charAt(0),rest.substring(1));
            //System.out.println("soFar: " +soFar + " ,rest: " +rest.substring(1));
            superset(soFar,rest.substring(1));
        }
    }

    public static void superSet(String current, String rest){

    }

    public static void arrSuperSet(List<Integer> soFar, List<Integer> rest) {
        if(rest.size() == 0) {
            System.out.println(soFar);
            //soFar.clear();
        }else{
            soFar.add(rest.get(0));
            arrSuperSet(soFar,rest.subList(1, rest.size()));
            //Remove the last element of the sublist
            soFar.remove(soFar.size()-1);
            arrSuperSet(soFar,rest.subList(1, rest.size()));
        }
    }

    public static void getTelNos(String soFar, int number){
        String[] vals = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(number==0){
            System.out.println(soFar);
        }else{
            int rem = number % 10;
            number /= 10;
            String s = vals[rem];
            for(int i = 0; i < s.length(); i++){
                getTelNos(s.charAt(i)+soFar,number);
            }
        }
    }

    public static String recReverse(String str){
        if(str.length()==0)
            return str;
        return (recReverse(str.substring(1)))+str.charAt(0);
    }

    public static void main(String[] args){
        String s1 = "123";
        superset("",s1);
//        String s = "abcd";
//        anagrams("",s);
//        System.out.println();
//        anagrams2(s);
//        System.out.println();
//        int[] arr = { 1, 2, 3};
//        arrayAnagrams(arr);
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);list.add(2);list.add(3);
//        arrSuperSet(new ArrayList<Integer> (),list);
    }


}
