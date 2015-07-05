package com.Singleton;

/**
 * Created by ksharma on 7/1/15.
 * This falls under Lazy initialization.
 * This will cause issues in multi-threaded environments
 * Need a lock mechanism
 */
public class SingletonExample3 {

    /**
     * Static variable which will contains the
     * single instance of the class
     * In this case the object is created when the jvm starts and loads this class
     */
    private volatile static SingletonExample3 singletonExample = new SingletonExample3();

    /**
     * Making this constructor private means that
     * only this class can call this constructor
     */
    private SingletonExample3() {
    }

    /**
     * Outside world can only call this method to get
     * the instance/object of the class.
     * To reduce overhead caused by synchronized everytime it is called we use volatile
     * and check for synchronization inside the medthod on the class
     */
    public static SingletonExample3 getSingletonExample1Instance() {
        if (singletonExample == null) {
            synchronized (SingletonExample3.class) {
                if (singletonExample == null) {
                    singletonExample = new SingletonExample3();
                    System.out.println("Initializing the class");
                }
            }

        }
        return singletonExample;
    }

    public void printSingleton() {
        System.out.println("Inside singleton class");
    }
}

/**
 * Enum is thread safe and implementation of Singleton through Enum ensures
 * that your singleton will have only one instance
 * even in a multithreaded environment.
 */

//public enum SingletonEnum {
//    INSTANCE;
//    public void doStuff(){
//        System.out.println("Singleton using Enum");
//    }
//}
//public static void main(String[] args) {
//        SingletonEnum.INSTANCE.doStuff();
//
//        }