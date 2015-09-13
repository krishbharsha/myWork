package com.graphs;

import com.google.common.collect.HashBasedTable;

import java.util.*;

/**
 * Created by ksharma on 7/20/15.
 * Constraints
 * 1≤T≤10
 * 2≤N≤1000
 * 1≤M≤N×(N−1)2
 * 1≤x,y,S≤N
 * 1
 * 4 2
 * 1 2
 * 1 3
 * 1
 * 6 6 -1
 */
public class BFSshortreach {

    public static int value = 0;

    public BFSshortreach(int val) {
        System.out.println("Constructor");
        value = val;
    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        BFSshortreach bfSshortreach1 = new BFSshortreach(10);

        int hashcode1 = bfSshortreach1.hashCode();

        //System.out.println("hashcode1 value : " + hashcode1);

        BFSshortreach bfSshortreach2 = new BFSshortreach(10);

        int hashcode2 = bfSshortreach2.hashCode();

        //System.out.println("hashcode2 value : " + hashcode2);

        // System.out.println("equals value : " + bfSshortreach1.equals(bfSshortreach2));

//
//        HashMap<String, Integer> hashMap = new HashMap<>();
//
//        hashMap.put("a", 10);
//        hashMap.put(null, 20);
//
//        int h;
//
//        System.out.println(("abc bbnn wjwjw".hashCode()));
//        int dummy = (h = "abc bbnn wjwjw".hashCode()) ^ (h >>> 16);
//        System.out.println(dummy);


        HashMap<Integer, Integer> hashMapEx = new HashMap<>();
        hashMapEx.put(10, 100);
        hashMapEx.put(30, 300);
        hashMapEx.put(20, 200);

        System.out.println("hashMapEx");
        System.out.println(hashMapEx.toString());

        TreeMap<Integer, Integer> treeMapEx = new TreeMap<>();
        treeMapEx.put(10, 100);
        treeMapEx.put(30, 300);
        treeMapEx.put(20, 200);

        System.out.println("treeMapEx");
        System.out.println(treeMapEx.toString());

        Hashtable<Integer, Integer> hashtableEx = new Hashtable<>();
        hashtableEx.put(10, 100);
        hashtableEx.put(30, 300);
        hashtableEx.put(20, 200);

        System.out.println("hashtableEx");
        System.out.println(hashtableEx.toString());

        LinkedHashMap<Integer, Integer> linkedHashMapEx = new LinkedHashMap<>();
        linkedHashMapEx.put(10, 100);
        linkedHashMapEx.put(30, 300);
        linkedHashMapEx.put(20, 200);

        System.out.println("linkedHashMapEx");
        System.out.println(linkedHashMapEx.toString());


        Iterator itr = hashMapEx.keySet().iterator();
        System.out.println("hashMapEx values");

        while (itr.hasNext()){

            System.out.println(hashMapEx.get(itr.next()));
        }


        hashMapEx.remove(10);



        Vector<Integer> vector1 = new Vector<>();
        Vector<Integer> vector2 = new Vector<>();

        vector1.add(10);
        vector1.add(20);
        vector1.add(30);
        vector1.add(40);
        vector1.add(50);
        vector1.add(60);

        vector2.add(10);
        vector2.add(20);
        vector2.add(40);
        vector2.add(50);
        vector2.add(80);
        vector2.add(90);
        vector2.add(170);

        Vector<Integer> vector3 = new Vector<>();

        Set<Integer> set1 = new TreeSet<>();

        set1.addAll(vector1);
        set1.addAll(vector2);
        vector3.addAll(set1);

        System.out.println(vector3);


//        Iterator iterator = vector3.iterator();
//
//        while(iterator.hasNext()){
//            System.out.println(vector3);
//        }

    }


}
