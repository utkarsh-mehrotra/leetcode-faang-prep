import java.util.*;

class _417_PacificAtlanticWaterFlow {
    private int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        if (heights == null || heights.length == 0) return res;
        int r = heights.length, c = heights[0].length;
        boolean[][] pac = new boolean[r][c];
        boolean[][] atl = new boolean[r][c];
        
        for (int i=0; i<r; i++) {
            dfs(heights, pac, i, 0, heights[i][0]);
            dfs(heights, atl, i, c-1, heights[i][c-1]);
        }
        for (int j=0; j<c; j++) {
            dfs(heights, pac, 0, j, heights[0][j]);
            dfs(heights, atl, r-1, j, heights[r-1][j]);
        }
        
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if (pac[i][j] && atl[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }
    private void dfs(int[][] h, boolean[][] seen, int r, int c, int prev) {
        if (r < 0 || c < 0 || r >= h.length || c >= h[0].length || seen[r][c] || h[r][c] < prev) return;
        seen[r][c] = true;
        for (int[] d : dirs) {
            dfs(h, seen, r+d[0], c+d[1], h[r][c]);
        }
    }
    public static void main(String[] args) {
        System.out.println("✅ Pacific Atlantic Water Flow implemented.");
    }
}
