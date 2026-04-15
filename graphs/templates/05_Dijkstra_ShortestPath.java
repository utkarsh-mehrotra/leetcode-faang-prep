import java.util.*;

class _05_Dijkstra_ShortestPath {

    // ----------------------------------------------------
    // DIJKSTRA'S ALGORITHM (PriorityQueue)
    // Time Complexity: O((V + E) log V)
    // Notes: Does not work with negative edge weights!
    // ----------------------------------------------------
    public int[] shortestPath(int N, List<List<int[]>> graph, int start) {
        int[] dist = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        // int[] = {node, cumulative_distance}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0];
            int currentDist = curr[1];

            // Primary optimization: Skip stale Queue state bounds
            if (currentDist > dist[u]) continue;

            for (int[] edge : graph.get(u)) {
                int v = edge[0], weight = edge[1];
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }
        return dist;
    }
}
