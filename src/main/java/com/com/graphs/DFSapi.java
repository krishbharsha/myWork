package com.com.graphs;

/**
 * Created by ksharma on 6/23/15.
 */
public class DFSapi {

    public static void main(String args[]) {

        StackGraph theStackGraph = new StackGraph();
        theStackGraph.addVertex('A');
        theStackGraph.addVertex('B');
        theStackGraph.addVertex('C');
        theStackGraph.addVertex('D');
        theStackGraph.addVertex('E');

        theStackGraph.addEdge(0, 1); //AB
        theStackGraph.addEdge(1, 2); //BC
        theStackGraph.addEdge(0, 3); //AD
        theStackGraph.addEdge(3, 4); //DE

        System.out.println("Visits : ");
        theStackGraph.dfs();
    }

}
