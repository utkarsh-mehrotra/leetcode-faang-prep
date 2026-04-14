class _322_CoinChange {
    Integer[] memo;
    public int solve(int[] coins, int amount) {
        memo = new Integer[amount + 1];
        int res = dfs(coins, amount);
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    private int dfs(int[] coins, int rem) {
        if (rem < 0) return Integer.MAX_VALUE;
        if (rem == 0) return 0;
        if (memo[rem] != null) return memo[rem];
        int min = Integer.MAX_VALUE;
        for (int c : coins) {
            int res = dfs(coins, rem - c);
            if (res != Integer.MAX_VALUE) min = Math.min(min, res + 1);
        }
        return memo[rem] = min;
    }
    public static void main(String[] args) {}
}
