
import java.util.Arrays;
public class Main {
    

    public static void main(String[] args) {
        int[][] arr = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        int n = arr.length; // Number of vertices

        // Arrays to store MST information
        boolean[] visited = new boolean[n]; // Whether a node is included in MST
        int[] key = new int[n];             // Minimum weight edge to include node
        int[] parent = new int[n];          // To store the MST tree

        // Initialize all keys as very large number
        for (int i = 0; i < n; i++) {
            key[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        // Start from the first vertex
        key[0] = 0;
        parent[0] = -1; // Root of the MST has no parent

        // Build the MST (n-1 edges)
        for (int count = 0; count < n - 1; count++) {
            int minKey = Integer.MAX_VALUE;
            int u = -1;

            // Find the unvisited vertex with the smallest key
            for (int v = 0; v < n; v++) {
                if (!visited[v] && key[v] < minKey) {
                    minKey = key[v];
                    u = v;
                }
            }

            visited[u] = true; // Include this vertex in MST

            // Update key and parent for adjacent vertices
            for (int v = 0; v < n; v++) {
                if (arr[u][v] != 0 && !visited[v] && arr[u][v] < key[v]) {
                    key[v] = arr[u][v];
                    parent[v] = u;
                }
            }
        }

        // Print the MST
        System.out.println("Minimum Spanning Tree edges:");
        for (int i = 1; i < n; i++) {
            System.out.println(parent[i] + " - " + i + " : " + arr[i][parent[i]]);
        }
    }
}

    

