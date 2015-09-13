package com.graphs;

/**
 * Created by ksharma on 6/23/15.
 */
public class DFSapi {

    public static void main(String args[]) {

        StackGraph theStackGraph = new StackGraph();
//        theStackGraph.addVertex('A');
//        theStackGraph.addVertex('B');
//        theStackGraph.addVertex('C');
//        theStackGraph.addVertex('D');
//        theStackGraph.addVertex('E');
//
//        theStackGraph.addEdge(0, 1); //AB
//        theStackGraph.addEdge(1, 2); //BC
//        theStackGraph.addEdge(0, 3); //AD
//        theStackGraph.addEdge(3, 4); //DE

//        System.out.println("Visits : ");
//        theStackGraph.dfs();

        theStackGraph.addVertex('A');
        theStackGraph.addVertex('B');
        theStackGraph.addVertex('C');
        theStackGraph.addVertex('D');
        theStackGraph.addVertex('E');
        theStackGraph.addVertex('F');
        theStackGraph.addVertex('G');
        theStackGraph.addVertex('H');
        theStackGraph.addVertex('I');
        theStackGraph.addVertex('J');

        theStackGraph.addEdge(2, 1);
        theStackGraph.addEdge(3, 1);
        theStackGraph.addEdge(4, 3);
        theStackGraph.addEdge(5, 2);
        theStackGraph.addEdge(6, 1);
        theStackGraph.addEdge(7, 2);
        theStackGraph.addEdge(8, 6);
        theStackGraph.addEdge(9, 8);
        theStackGraph.addEdge(10, 8);

        theStackGraph.evenTree();

    }

}
