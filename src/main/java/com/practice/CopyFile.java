package com.practice;

import java.io.*;

/**
 * Created by ksharma on 6/28/15.
 */
public class CopyFile {

    public static void main(String args[]) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("/Users/ksharma/dummy.txt");
            out = new FileOutputStream("/Users/ksharma/out.txt");

            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found exception");
        } catch (IOException e) {
            System.out.println("IO exception");
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }

        CreateDir();
    }

    public static void CreateDir() {
        String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);

        // Create directory now.
        d.mkdirs();
    }
}

