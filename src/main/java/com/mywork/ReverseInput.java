package com.mywork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ksharma on 6/13/15.
 */
public class ReverseInput {

    public static void main (String args[]){

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = "";

        try {
            line = bufferedReader.readLine();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

        System.out.println(line);

        for (int m=line.length()-1; m >= 0; m--){
            System.out.print(line.charAt(m));
        }

    }
}
