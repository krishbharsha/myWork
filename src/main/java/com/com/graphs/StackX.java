package com.com.graphs;

/**
 * Created by ksharma on 6/23/15.
 */
public class StackX {

    private final int SIZE = 20;
    private int[] st;
    private int top;

    public StackX() {
        st = new int[SIZE];
        top = -1;
    }

    public void push(int j) {
        st[++top] = j;
    }

    public int pop() {
        return st[--top];
    }

    public int peek() {
//        if( top ==-1){
//            return -1;
//        }
        return st[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

}
