package com.com.graphs;

/**
 * Created by ksharma on 6/23/15.
 */
public class QueueGraph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private Queue theQueue;

    public QueueGraph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;

        for (int m = 0; m < MAX_VERTS; m++)
            for (int n = 0; n < MAX_VERTS; n++)
                adjMat[m][n] = 0;
        theQueue = new Queue();
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.println(vertexList[v].label);
    }

    public void bfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theQueue.insert(0);
        int v2;

        while (!theQueue.isEmpty()) {
            int v1 = theQueue.remove();


            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = true;
                displayVertex(v2);
                theQueue.insert(v2);
            }
        }

        //queue is empty.
        for (int m = 0; m < nVerts; m++) {
            vertexList[m].wasVisited = false;
        }

    }

    public int getAdjUnvisitedVertex(int v) {
        for (int n = 0; n < nVerts; n++) {
            if (adjMat[v][n] == 1 && vertexList[n].wasVisited == false) {
                return n;
            }

        }
        return -1;
    }

}
