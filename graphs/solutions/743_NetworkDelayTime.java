import java.util.*;
class _743_NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] t : times) {
            adj.putIfAbsent(t[0], new ArrayList<>());
            adj.get(t[0]).add(new int[]{t[1], t[2]});
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{k, 0});
        
        Map<Integer, Integer> dist = new HashMap<>();
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0], d = curr[1];
            if (dist.containsKey(u)) continue;
            dist.put(u, d);
            
            if (adj.containsKey(u)) {
                for (int[] next : adj.get(u)) {
                    if (!dist.containsKey(next[0])) {
                        pq.offer(new int[]{next[0], d + next[1]});
                    }
                }
            }
        }
        if (dist.size() != n) return -1;
        int res = 0;
        for (int d : dist.values()) res = Math.max(res, d);
        return res;
    }
    public static void main(String[] args) {}
}
