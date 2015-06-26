package com.com.graphs;

/**
 * Created by ksharma on 6/23/15.
 */
public class StackGraph {
    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private StackX theStack;

    public StackGraph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;

        for (int m = 0; m < MAX_VERTS; m++)
            for (int n = 0; n < MAX_VERTS; n++)
                adjMat[m][n] = 0;
        theStack = new StackX();
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

    public void dfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        theStack.push(0);

        while( !theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex(theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                vertexList[v].wasVisited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }

        //reset the was visted flag as the stack is displayed.
        for (int m =0; m<nVerts; m++){
            vertexList[m].wasVisited = false;
        }

    }

    public int getAdjUnvisitedVertex(int v){
        for(int n=0; n<nVerts; n++){
            if(adjMat[v][n] == 1 && vertexList[n].wasVisited ==false){
                return n;
            }

        }
        return -1;
    }

}
