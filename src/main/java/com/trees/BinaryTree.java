package com.trees;

/**
 * Created by ksharma on 6/17/15.
 */
public class BinaryTree {

    public static void main(String args[]) {


        Tree tree = new Tree();

        //build the binary tree
        tree.insert(60);
        tree.insert(30);
        tree.insert(10);
        tree.insert(100);
        tree.insert(80);
        tree.insert(40);
        tree.insert(50);
        tree.insert(120);
        tree.insert(70);
        tree.insert(90);
        tree.insert(20);
        tree.insert(0);
        tree.insert(110);
        tree.insert(130);


        tree.display();

        tree.delete(40);

        tree.find(50);

    }
}
