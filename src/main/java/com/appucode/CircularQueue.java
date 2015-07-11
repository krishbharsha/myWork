package com.appucode;

/**
 * Created by ksharma on 7/5/15.
 */
public class CircularQueue {

    private int[] cirQueue;
    private int front;
    private int rear;
    private int size;
    private int currentSize;

    public CircularQueue(int size) {
        cirQueue = new int[size];
        this.size = size;
        front = 0;
        rear = 0;
        currentSize = 0;
    }

    public void printQueue() {
        for (int m = front; m < currentSize; m++) {
            System.out.println(cirQueue[m]);
        }
    }

    public synchronized void enQueue(int i) {

        if (currentSize == size) {
            throw new IllegalStateException("Queue full ");
        }

        cirQueue[rear++] = i;
        rear = rear % size;
        currentSize++;
    }

    public synchronized void deQueue() {

        if (currentSize == 0) {
            throw new IllegalStateException("Queue is empty ");
        }

        cirQueue[front++] = -1;
        currentSize--;

    }

    public int getCurrentSize() {
        return currentSize;
    }
}
