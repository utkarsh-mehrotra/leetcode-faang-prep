import java.util.*;

class _08_MaxFlow_Bipartite {
    
    // ----------------------------------------------------
    // EDMONDS-KARP ALGORITHM (Ford-Fulkerson O(V*E^2))
    // Finds Maximum Flow using BFS
    // ----------------------------------------------------
    public int edmondsKarp(int N, int[][] capacity, int source, int sink) {
        int maxFlow = 0;
        int[] parent = new int[N]; // stores path augmentation

        while (bfsEK(N, capacity, source, sink, parent)) {
            // Find bottleneck capacity along the BFS path discovered
            int pathFlow = Integer.MAX_VALUE;
            int curr = sink;
            while (curr != source) {
                int prev = parent[curr];
                pathFlow = Math.min(pathFlow, capacity[prev][curr]);
                curr = prev;
            }

            // Subvert capacities (augment graph residual)
            curr = sink;
            while (curr != source) {
                int prev = parent[curr];
                capacity[prev][curr] -= pathFlow; // forward edge
                capacity[curr][prev] += pathFlow; // residual back edge reverse
                curr = prev;
            }
            maxFlow += pathFlow;
        }
        return maxFlow;
    }

    private boolean bfsEK(int N, int[][] capacity, int s, int t, int[] parent) {
        boolean[] visited = new boolean[N];
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(s);
        visited[s] = true;
        parent[s] = -1;

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v = 0; v < N; v++) {
                if (!visited[v] && capacity[u][v] > 0) { // exists and capacity available
                    if (v == t) {
                        parent[v] = u;
                        return true;
                    }
                    q.offer(v);
                    visited[v] = true;
                    parent[v] = u;
                }
            }
        }
        return false;
    }
}
