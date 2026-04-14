import java.util.*;
class _1245_TreeDiameter {
    private int maxDiameter = 0;
    public int treeDiameter(int[][] edges) {
        int n = edges.length + 1;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0; i<n; i++) adj.add(new ArrayList<>());
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        dfs(0, -1, adj);
        return maxDiameter;
    }
    private int dfs(int u, int parent, List<List<Integer>> adj) {
        int max1 = 0, max2 = 0;
        for (int v : adj.get(u)) {
            if (v != parent) {
                int depth = dfs(v, u, adj);
                if (depth > max1) {
                    max2 = max1;
                    max1 = depth;
                } else if (depth > max2) {
                    max2 = depth;
                }
            }
        }
        maxDiameter = Math.max(maxDiameter, max1 + max2);
        return max1 + 1;
    }
    public static void main(String[] args) {}
}
