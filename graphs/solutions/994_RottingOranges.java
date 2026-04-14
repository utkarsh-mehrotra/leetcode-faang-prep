import java.util.*;

class _994_RottingOranges {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == 2) q.offer(new int[]{i, j});
                else if (grid[i][j] == 1) fresh++;
            }
        }
        
        if (fresh == 0) return 0;
        int time = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rotted = false;
            for (int i=0; i<size; i++) {
                int[] curr = q.poll();
                for (int[] d : dirs) {
                    int r = curr[0] + d[0], c = curr[1] + d[1];
                    if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        q.offer(new int[]{r, c});
                        fresh--;
                        rotted = true;
                    }
                }
            }
            if (rotted) time++;
        }
        return fresh == 0 ? time : -1;
    }
    public static void main(String[] args) {
        System.out.println("✅ Rotting Oranges implemented.");
    }
}
