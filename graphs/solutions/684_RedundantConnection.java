class _684_RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        for (int i=0; i<=n; i++) parent[i] = i;
        
        for (int[] edge : edges) {
            int p1 = find(parent, edge[0]);
            int p2 = find(parent, edge[1]);
            if (p1 == p2) return edge;
            parent[p1] = p2;
        }
        return new int[0];
    }
    private int find(int[] parent, int i) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent, parent[i]);
    }
    public static void main(String[] args) {
        System.out.println("✅ Redundant Connection implemented.");
    }
}
