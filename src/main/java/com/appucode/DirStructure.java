package com.appucode;

import java.io.File;

/**
 * Created by ksharma on 6/26/15.
 */
public class DirStructure {

    public static void listDirStructure(String path){
        File file = new File(path);
        while(true) {
            if (file.isDirectory()) {
                for (File f : file.listFiles()) {
                    if (f.isDirectory()) {
                        System.out.println(f.getAbsolutePath());
                        listDirStructure(f.getAbsolutePath());
                    }
                }
            }
            if (file.isFile()) {
                System.out.println(file.getAbsoluteFile());
            }
        }
    }

    public static void main(String args[]){
        listDirStructure("/Users/ksharma/Downloads/");
    }
}
