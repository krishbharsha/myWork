package com.appucode;

/**
 * Created by ksharma on 6/26/15.
 * bounded-buffer problem
 * multi-process synchronization problem
 */
public class ProducerConsumer {

    public static void main(String args[]) {

        Queue q = new Queue();
        new Consumer(q);
        new Producer(q);

    }

}
