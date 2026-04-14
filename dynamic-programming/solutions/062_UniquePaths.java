class _062_UniquePaths {
    Integer[][] memo;
    public int solve(int m, int n) {
        memo = new Integer[m][n];
        return dfs(m-1, n-1);
    }
    private int dfs(int r, int c) {
        if (r == 0 || c == 0) return 1;
        if (memo[r][c] != null) return memo[r][c];
        return memo[r][c] = dfs(r-1, c) + dfs(r, c-1);
    }
    public static void main(String[] args) {}
}
