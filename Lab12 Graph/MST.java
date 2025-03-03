// A Java program for Prim's Minimum Spanning Tree (MST)
// algorithm. The program is for adjacency matrix
// representation of the graph

import java.io.*;
import java.lang.*;
import java.util.*;

class MST {

    // A utility function to find the vertex with minimum
    // key value, from the set of vertices not yet included
    // in MST
    int minKey(int key[], Boolean mstSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < mstSet.length; v++)
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }

        return min_index;
    }

    // A utility function to print the constructed MST
    // stored in parent[]
    void printMST(int parent[], int graph[][])
    {
        int total = 0;
        System.out.println("Edge \tWeight");
        for (int i = 1; i < graph.length; i++){
            System.out.println(parent[i] + " - " + i + "\t"
                               + graph[parent[i]][i]);
            total += graph[parent[i]][i];
        }
        System.out.println("total weight = "+ total);
    }


    // Function to construct and print MST for a graph
    // represented using adjacency matrix representation
    void primMST(int graph[][])
    {
        int V = graph.length;

        // Array to store constructed MST
        int parent[] = new int[V];

        // Key values used to pick minimum weight edge in
        // cut
        int key[] = new int[V];

        // To represent set of vertices included in MST
        Boolean mstSet[] = new Boolean[V];

        // Initialize all keys as INFINITE
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        // Always include first 1st vertex in MST.
        // Make key 0 so that this vertex is
        // picked as first vertex
        key[0] = 0;
      
        // First node is always root of MST
        parent[0] = -1;

        // The MST will have V vertices
        for (int count = 0; count < V - 1; count++) {
            
            // Pick the minimum key vertex from the set of
            // vertices not yet included in MST
            int u = minKey(key, mstSet);

            // Add the picked vertex to the MST Set
            mstSet[u] = true;

            // Update key value and parent index of the
            // adjacent vertices of the picked vertex.
            // Consider only those vertices which are not
            // yet included in MST
            for (int v = 0; v < V; v++)

                // graph[u][v] is non zero only for adjacent
                // vertices of m mstSet[v] is false for
                // vertices not yet included in MST Update
                // the key only if graph[u][v] is smaller
                // than key[v]
                if (graph[u][v] != 0 && mstSet[v] == false
                    && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }

        // Print the constructed MST
        printMST(parent, graph);
    }

    public static void main(String[] args) {
        MST t = new MST();
       
        // Graph from Task 6
        int graph[][] = {
            {0, 8, 4, 2, 0, 0},  // a -> {b, c, d}
            {8, 0, 2, 0, 4, 0},  // b -> {a, c, e}
            {4, 2, 0, 3, 7, 5},  // c -> {a, b, d, e, f}
            {2, 0, 3, 0, 0, 2},  // d -> {a, c, f}
            {0, 4, 7, 0, 0, 0},  // e -> {b, c}
            {0, 0, 5, 2, 0, 0}   // f -> {c, d}
        };
 
        t.primMST(graph);
    }
}
    

