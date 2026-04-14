import java.util.*;
class _1192_CriticalConnectionsInANetwork {
    int time = 0;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> res = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0; i<n; i++) adj.add(new ArrayList<>());
        for (List<Integer> c : connections) {
            adj.get(c.get(0)).add(c.get(1));
            adj.get(c.get(1)).add(c.get(0));
        }
        int[] disc = new int[n];
        int[] low = new int[n];
        Arrays.fill(disc, -1);
        
        dfs(0, -1, disc, low, adj, res);
        return res;
    }
    private void dfs(int u, int parent, int[] disc, int[] low, List<List<Integer>> adj, List<List<Integer>> res) {
        disc[u] = low[u] = time++;
        for (int v : adj.get(u)) {
            if (v == parent) continue;
            if (disc[v] == -1) {
                dfs(v, u, disc, low, adj, res);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] > disc[u]) res.add(Arrays.asList(u, v));
            } else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
    public static void main(String[] args) {}
}
