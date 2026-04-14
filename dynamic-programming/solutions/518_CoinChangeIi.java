class _518_CoinChangeIi {
    Integer[][] memo;
    public int solve(int amount, int[] coins) {
        memo = new Integer[coins.length][amount + 1];
        return dfs(amount, coins, 0);
    }
    private int dfs(int rem, int[] coins, int idx) {
        if (rem == 0) return 1;
        if (rem < 0 || idx == coins.length) return 0;
        if (memo[idx][rem] != null) return memo[idx][rem];
        return memo[idx][rem] = dfs(rem - coins[idx], coins, idx) + dfs(rem, coins, idx+1);
    }
    public static void main(String[] args) {}
}
