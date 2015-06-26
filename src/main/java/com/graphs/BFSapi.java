package com.graphs;

/**
 * Created by ksharma on 6/23/15.
 */
public class BFSapi {

    public static void main(String args[]) {

        QueueGraph theQueueGraph = new QueueGraph();
        theQueueGraph.addVertex('A');
        theQueueGraph.addVertex('B');
        theQueueGraph.addVertex('C');
        theQueueGraph.addVertex('D');
        theQueueGraph.addVertex('E');

        theQueueGraph.addEdge(0, 1); //AB
        theQueueGraph.addEdge(1, 2); //BC
        theQueueGraph.addEdge(0, 3); //AD
        theQueueGraph.addEdge(3, 4); //DE

        System.out.println("Visits : ");
        theQueueGraph.bfs();
    }

}
