class _064_MinimumPathSum {
    Integer[][] memo;
    public int solve(int[][] grid) {
        memo = new Integer[grid.length][grid[0].length];
        return dfs(grid, grid.length-1, grid[0].length-1);
    }
    private int dfs(int[][] grid, int r, int c) {
        if (r == 0 && c == 0) return grid[0][0];
        if (r < 0 || c < 0) return Integer.MAX_VALUE;
        if (memo[r][c] != null) return memo[r][c];
        int up = dfs(grid, r-1, c);
        int left = dfs(grid, r, c-1);
        return memo[r][c] = grid[r][c] + Math.min(up, left);
    }
    public static void main(String[] args) {}
}
