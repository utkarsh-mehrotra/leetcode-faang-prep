import java.util.*;
class _1162_AsFarFromLandAsPossible {
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        Queue<int[]> q = new LinkedList<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j] == 1) q.offer(new int[]{i, j});
            }
        }
        if (q.size() == 0 || q.size() == n*n) return -1;
        
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        int dist = -1;
        
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i=0; i<size; i++) {
                int[] curr = q.poll();
                for (int[] d : dirs) {
                    int r = curr[0]+d[0], c = curr[1]+d[1];
                    if (r>=0 && c>=0 && r<n && c<n && grid[r][c] == 0) {
                        grid[r][c] = 1;
                        q.offer(new int[]{r, c});
                    }
                }
            }
            dist++;
        }
        return dist;
    }
    public static void main(String[] args) {}
}
