import java.util.*;

class _07_MST_Kruskal_Prim {

    // ----------------------------------------------------
    // KRUSKAL'S MST ALGORITHM (Using DSU)
    // Edge List input: int[][] edges = [[u, v, weight], ...]
    // ----------------------------------------------------
    public int kruskalMST(int N, int[][] edges) {
        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2])); // sort by weight ascending
        
        int[] parent = new int[N];
        for(int i=0; i<N; i++) parent[i] = i;
        
        int mstCost = 0;
        int edgesAdded = 0;

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            if (union(u, v, parent)) {
                mstCost += w;
                edgesAdded++;
                if (edgesAdded == N - 1) break;
            }
        }
        return edgesAdded == N - 1 ? mstCost : -1;
    }

    private int find(int i, int[] parent) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent[i], parent);
    }
    private boolean union(int i, int j, int[] parent) {
        int p1 = find(i, parent), p2 = find(j, parent);
        if (p1 == p2) return false;
        parent[p1] = p2;
        return true;
    }

    // ----------------------------------------------------
    // PRIM'S MST ALGORITHM (Using Priority Queue)
    // ----------------------------------------------------
    public int primMST(int N, List<List<int[]>> graph) {
        boolean[] inMST = new boolean[N];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{0, 0}); // start at node 0, cost 0
        
        int mstCost = 0;
        int edgesUsed = 0;

        while (!pq.isEmpty() && edgesUsed < N) {
            int[] curr = pq.poll();
            int u = curr[0], weight = curr[1];

            if (inMST[u]) continue; // Stale

            inMST[u] = true;
            mstCost += weight;
            edgesUsed++;

            for (int[] edge : graph.get(u)) {
                int v = edge[0], w = edge[1];
                if (!inMST[v]) {
                    pq.offer(new int[]{v, w});
                }
            }
        }
        return edgesUsed == N ? mstCost : -1;
    }
}
