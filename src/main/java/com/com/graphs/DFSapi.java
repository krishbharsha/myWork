package com.com.graphs;

/**
 * Created by ksharma on 6/23/15.
 */
public class DFSapi {

    public static void main(String args[]) {

        Graph theGraph = new Graph();
        theGraph.addVertex('A');
        theGraph.addVertex('B');
        theGraph.addVertex('C');
        theGraph.addVertex('D');
        theGraph.addVertex('E');

        theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(0, 3); //AD
        theGraph.addEdge(3, 4); //DE

        System.out.println("Visits : ");
        theGraph.dfs();
    }

}
