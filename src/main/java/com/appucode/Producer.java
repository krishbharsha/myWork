package com.appucode;

/**
 * Created by ksharma on 6/27/15.
 */
public class Producer implements Runnable {

    Queue queue;

    public Producer(Queue q) {
        queue = q;
        new Thread(this).start();
        System.out.println("Producer thread started");
    }

    public void run() {

        System.out.println("Producer thread run");
        int value = 0;
        while (true) {
            value = queue.fetch();
            System.out.print(" P * " + value);
        }
    }
}
