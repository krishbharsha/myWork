package com.appucode;

/**
 * Created by ksharma on 6/27/15.
 */
public class Queue {

    private static int MAX_SIZE = 20;
    private static int[] intArray;
    private static int front;
    private static int rear;

    public Queue() {
        intArray = new int[MAX_SIZE];
        front = 0;
        rear = -1;
    }

    public synchronized void push(int value) {
//        try {
//            wait();
//        } catch (InterruptedException e){
//            System.out.println("Interrupted Exception caught in consumer push");
//        }
        if (rear == MAX_SIZE - 1) {
            notify();
            while (rear != -1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Interrupted Exception caught in consumer push");
                }
            }

        }
        intArray[++rear] = value;
        notify();
    }

    public synchronized int fetch() {
        if (!isFull()) {
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught in producer fetch");
            }
        }
        int value = intArray[front++];
        if (front == MAX_SIZE) front = 0;
        return value;
    }

    public boolean isEmpty() {
        return (rear + 1 == front || (front + MAX_SIZE - 1 == rear));
    }

    public boolean isFull() {
        return (rear == MAX_SIZE - 1 || (front + MAX_SIZE - 1 == rear));
    }
}

