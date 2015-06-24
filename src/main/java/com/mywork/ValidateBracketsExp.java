package com.mywork;

import com.google.common.base.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by ksharma on 6/13/15.
 */
public class ValidateBracketsExp {

    public static void main(String args[]) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String exp = null;

        try {
            exp = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!Strings.isNullOrEmpty(exp)) {
            validateExpr(exp);
        } else System.out.println("Enter a valid line");
    }

    private static void validateExpr(String expr) {

        int len = expr.length();
        boolean flag = true;

        Stack stack = new Stack(len);

        for (int m = 0; m < len; m++) {

            char ch = expr.charAt(m);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                char poppedCh = stack.pop();

                switch (ch) {
                    case '}':
                        flag = (poppedCh == '{') ? true : false;
                        break;
                    case ']':
                        flag = (poppedCh == '[') ? true : false;
                        break;
                    case ')':
                        flag = (poppedCh == '(') ? true : false;
                        break;
                    default:
                        break;
                }

                if (!flag) break;
            }
        }

        if (!flag) {
            System.out.println(" string is not valid");
        } else
            System.out.println(" string is valid");

    }


}

class Stack {

    private char[] charArray;
    private int nElem = 0;

    public Stack(int size) {
        charArray = new char[size];
    }

    public void push(char elem) {
        charArray[nElem] = elem;
        nElem++;
    }

    public char pop() {
        nElem--;
        return charArray[nElem];
    }

}
