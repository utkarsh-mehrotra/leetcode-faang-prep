import java.util.*;
class _778_SwimInRisingWater {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.offer(new int[]{0, 0, grid[0][0]});
        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;
        
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        int res = 0;
        
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            res = Math.max(res, curr[2]);
            if (curr[0] == n-1 && curr[1] == n-1) return res;
            
            for (int[] d : dirs) {
                int r = curr[0]+d[0], c = curr[1]+d[1];
                if (r>=0 && c>=0 && r<n && c<n && !visited[r][c]) {
                    visited[r][c] = true;
                    pq.offer(new int[]{r, c, grid[r][c]});
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {}
}
