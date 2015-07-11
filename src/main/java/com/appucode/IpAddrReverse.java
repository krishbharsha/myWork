package com.appucode;

/**
 * Created by ksharma on 7/4/15.
 * Reverse the ip address
 * Does not work
 */
public class IpAddrReverse {

    public static void main(String[] args) {
        StringBuffer ipAddr = new StringBuffer("192.168.34.184");

        //StringBuffer ipRev = ipReverse(ipAddr);

        String fs;
        float floatVar = 20.0f;
        int intVar = 20;
        String stringVar = "20";

        fs = String.format(" The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s  ", floatVar, intVar, stringVar);
        System.out.println(fs);
        System.out.println(fs.indexOf("variable"));
        System.out.println(fs.trim());
        System.out.println(fs.toCharArray());


        //System.out.println("Reverse IP Address: " + ipRev.toString());

    }

    public static StringBuffer ipReverse(StringBuffer ipAddr) {

        char temp;

        int length = ipAddr.length();
        char[] charArray = new char[length];

        for (int m = 0; m < length; m++) {
            charArray[m] = ipAddr.charAt(m);
        }

        for (int m = 0; m < length; m++) {
            temp = charArray[m];
            charArray[m] = charArray[(length-1) -m];
            charArray[(length-1) -m] = temp;
        }
//        int m = 0;
//        while ( m < length) {
//
//            temp = charArray[m];
//            charArray[m] = charArray[(length-1) -m];
//            charArray[(length-1) -m] = temp;
//        }

        ipAddr = new StringBuffer(charArray.toString());
        return ipAddr;




    }
}
