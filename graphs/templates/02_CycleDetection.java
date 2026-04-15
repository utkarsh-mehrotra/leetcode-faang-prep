import java.util.*;

class _02_CycleDetection {

    // ----------------------------------------------------
    // UNDIRECTED GRAPH CYCLE DETECTION (DFS)
    // ----------------------------------------------------
    public boolean hasUndirectedCycle(List<List<Integer>> graph, int N) {
        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                if (dfsUndirected(graph, i, -1, visited)) return true;
            }
        }
        return false;
    }

    private boolean dfsUndirected(List<List<Integer>> graph, int u, int parent, boolean[] visited) {
        visited[u] = true;
        for (int v : graph.get(u)) {
            if (!visited[v]) {
                if (dfsUndirected(graph, v, u, visited)) return true;
            } else if (v != parent) {
                return true; // Cycle detected: Back-edge found
            }
        }
        return false;
    }

    // ----------------------------------------------------
    // DIRECTED GRAPH CYCLE DETECTION (DFS - 3 COLORING)
    // ----------------------------------------------------
    public boolean hasDirectedCycle(List<List<Integer>> graph, int N) {
        int[] state = new int[N]; // 0=Unvisited, 1=Visiting(Stack), 2=Visited
        for (int i = 0; i < N; i++) {
            if (state[i] == 0) {
                if (dfsDirected(graph, i, state)) return true;
            }
        }
        return false;
    }

    private boolean dfsDirected(List<List<Integer>> graph, int u, int[] state) {
        state[u] = 1;
        for (int v : graph.get(u)) {
            if (state[v] == 1) return true; // Cycle detected: Back-edge to current recursion stack
            if (state[v] == 0 && dfsDirected(graph, v, state)) return true;
        }
        state[u] = 2; // Marked fully processed
        return false;
    }
}
