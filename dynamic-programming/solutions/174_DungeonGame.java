class _174_DungeonGame {
    Integer[][] memo;
    public int solve(int[][] dungeon) {
        memo = new Integer[dungeon.length][dungeon[0].length];
        return dfs(dungeon, 0, 0);
    }
    private int dfs(int[][] dungeon, int r, int c) {
        int m = dungeon.length, n = dungeon[0].length;
        if (r >= m || c >= n) return Integer.MAX_VALUE;
        if (r == m - 1 && c == n - 1) return Math.max(1, 1 - dungeon[r][c]);
        if (memo[r][c] != null) return memo[r][c];
        int right = dfs(dungeon, r, c + 1);
        int down = dfs(dungeon, r + 1, c);
        int minHealth = Math.min(right, down) - dungeon[r][c];
        return memo[r][c] = Math.max(1, minHealth);
    }
    public static void main(String[] args) {}
}
