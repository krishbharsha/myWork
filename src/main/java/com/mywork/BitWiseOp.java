package com.mywork;

/**
 * Created by ksharma on 6/8/15.
 */
public class BitWiseOp {

    public void BitWiseOp() {
        System.out.println("constructor created");
    }

    public static void bitTets1() {

        int a = 4;
        int b = 6;

        int c = a | b;
        int d = a & b;
        System.out.println(c);
        System.out.println(d);

        c = a >> 2;
        d = b << 2;
        System.out.println(c);
        System.out.println(d);

        c = a ^ b;
        d = ~(b ^ a);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String args[]) {
        bitTets1();
    }
}
