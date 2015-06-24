package com.trees;

/**
 * Created by ksharma on 6/17/15.
 */
public class Tree {

    Node root;

    public Tree(){
        root = null;
    }

    public void insert(int data) {

        Node newNode = new Node();
        newNode.data = data;

        if(root == null){
            root = newNode;
        } else {

            Node current = root;
            Node parent;

            while(true){

            }

        }
    }

    public void find(int data) {
    }

    public void delete(int data) {
    }

    public void display(){}
}
