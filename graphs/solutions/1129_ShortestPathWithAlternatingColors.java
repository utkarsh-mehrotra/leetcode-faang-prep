import java.util.*;
class _1129_ShortestPathWithAlternatingColors {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        Map<Integer, List<Integer>> redAdj = new HashMap<>();
        Map<Integer, List<Integer>> blueAdj = new HashMap<>();
        for (int i=0; i<n; i++) {
            redAdj.put(i, new ArrayList<>());
            blueAdj.put(i, new ArrayList<>());
        }
        for (int[] e : redEdges) redAdj.get(e[0]).add(e[1]);
        for (int[] e : blueEdges) blueAdj.get(e[0]).add(e[1]);
        
        int[] res = new int[n];
        Arrays.fill(res, -1);
        
        Queue<int[]> q = new LinkedList<>();
        // 0 for red, 1 for blue
        q.offer(new int[]{0, 0, 0});
        q.offer(new int[]{0, 0, 1});
        
        boolean[][] visited = new boolean[n][2];
        visited[0][0] = true;
        visited[0][1] = true;
        res[0] = 0;
        
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int node = curr[0], dist = curr[1], color = curr[2];
            
            Map<Integer, List<Integer>> adj = color == 0 ? blueAdj : redAdj;
            int nextColor = 1 - color;
            
            for (int next : adj.get(node)) {
                if (!visited[next][nextColor]) {
                    visited[next][nextColor] = true;
                    if (res[next] == -1) res[next] = dist + 1;
                    q.offer(new int[]{next, dist + 1, nextColor});
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {}
}
