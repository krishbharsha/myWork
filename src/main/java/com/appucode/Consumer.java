package com.appucode;

import java.util.Random;

/**
 * Created by ksharma on 6/27/15.
 */
public class Consumer implements Runnable {

    Queue queue;

    Consumer(Queue q) {
        queue = q;
        new Thread(this).start();
        System.out.println("Consumer thread started");
    }

    public void run() {
        int value;
        System.out.println("Consumer thread run");

        while (true) {
            value = new Random().nextInt(10);
            queue.push(value);
            System.out.print(" C - " + value);
        }
    }
}
