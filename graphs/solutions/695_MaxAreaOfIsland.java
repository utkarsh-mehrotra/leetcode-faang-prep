class _695_MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int r=0; r<grid.length; r++) {
            for (int c=0; c<grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    max = Math.max(max, dfs(grid, r, c));
                }
            }
        }
        return max;
    }
    private int dfs(int[][] g, int r, int c) {
        if (r < 0 || c < 0 || r >= g.length || c >= g[0].length || g[r][c] == 0) return 0;
        g[r][c] = 0;
        return 1 + dfs(g, r+1, c) + dfs(g, r-1, c) + dfs(g, r, c+1) + dfs(g, r, c-1);
    }
    public static void main(String[] args) {
        System.out.println("✅ Max Area of Island implemented.");
    }
}
