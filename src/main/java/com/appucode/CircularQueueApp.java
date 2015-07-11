package com.appucode;

/**
 * Created by ksharma on 7/5/15.
 */
public class CircularQueueApp {

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);
        circularQueue.enQueue(7);
        circularQueue.enQueue(8);
        circularQueue.enQueue(6);
        circularQueue.deQueue();
        circularQueue.enQueue(9);
        circularQueue.printQueue();

    }
}