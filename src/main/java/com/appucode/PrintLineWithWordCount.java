package com.appucode;

/**
 * Created by ksharma on 7/4/15.
 * "three blind mice
 * mice blind mice
 * see how they run
 * see how they run”
 * <p>
 * input=three mice
 * <p>
 * produces:
 * "three blind mice
 * mice blind mice
 * 4"
 */
public class PrintLineWithWordCount {

    public static void main(String[] args) {
        String[] inputArr = {"three", "mice"};
        String[] strArr = {"three blind mice", "mice blind mice", "see how they run", "see how they run"};
        printLine(strArr, inputArr);
    }

    public static void printLine(String[] strArr, String[] inputArr) {

        int count = 0;
        for (String str : strArr) {
            int innerCount = 0;
            for (String s : str.split(" ")) {
                for (String in : inputArr) {
                    if (s.equals(in)) {
                        innerCount++;
                    }
                }

            }
            if (innerCount > 0) {
                System.out.println(str);
                count = count + innerCount;
            }
        }
        System.out.println(count);
    }
}
