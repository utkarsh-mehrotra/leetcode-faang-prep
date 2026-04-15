import java.util.*;

class _06_Bridges_SCC_Tarjan {

    private int time = 0;

    // ----------------------------------------------------
    // TARJAN'S ALGORITHM FOR BRIDGES (Critical Connections)
    // ----------------------------------------------------
    public List<List<Integer>> findBridges(int N, List<List<Integer>> graph) {
        List<List<Integer>> bridges = new ArrayList<>();
        int[] disc = new int[N]; // discovery times
        int[] low = new int[N];  // lowest reachable time
        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);

        for (int i = 0; i < N; i++) {
            if (disc[i] == -1) {
                dfsBridges(i, -1, disc, low, graph, bridges);
            }
        }
        return bridges;
    }

    private void dfsBridges(int u, int parent, int[] disc, int[] low, List<List<Integer>> graph, List<List<Integer>> bridges) {
        disc[u] = low[u] = ++time;

        for (int v : graph.get(u)) {
            if (v == parent) continue; // tree edge fallback guard
            if (disc[v] != -1) {
                // Back edge encountered
                low[u] = Math.min(low[u], disc[v]);
            } else {
                // Forward expansion
                dfsBridges(v, u, disc, low, graph, bridges);
                low[u] = Math.min(low[u], low[v]);

                // Bridge condition: if child's lowest reachable is structurally behind its discovery
                if (low[v] > disc[u]) {
                    bridges.add(Arrays.asList(u, v));
                }
            }
        }
    }
}
