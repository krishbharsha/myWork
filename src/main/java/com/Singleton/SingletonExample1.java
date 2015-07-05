package com.Singleton;

/**
 * Created by ksharma on 7/1/15.
 * This falls under Lazy initialization.
 * This will cause issues in multi-threaded environments
 * Need a lock mechanism
 */
public class SingletonExample1 {

    /**
     * Static variable which will contains the
     * single instance of the class
     */
    private static SingletonExample1 singletonExample;

    /**
     * Making this constructor private means that
     * only this class can call this constructor
     */
    private SingletonExample1() {
    }

    /**
     * Outside world can only call this method to get
     * the instance/object of the class.
     */
    public static SingletonExample1 getSingletonExample1Instance() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample1();
            System.out.println("Initializing the class");
        }
        return singletonExample;
    }

    public void printSingleton(){
        System.out.println("Inside singleton class");
    }
}
