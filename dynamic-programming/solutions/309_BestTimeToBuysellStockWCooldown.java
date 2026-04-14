class _309_BestTimeToBuysellStockWCooldown {
    Integer[][] memo;
    public int solve(int[] prices) {
        memo = new Integer[prices.length][2];
        return dfs(prices, 0, 1);
    }
    private int dfs(int[] p, int idx, int available) {
        if (idx >= p.length) return 0;
        if (memo[idx][available] != null) return memo[idx][available];
        if (available == 1) {
            return memo[idx][available] = Math.max(-p[idx] + dfs(p, idx+1, 0), dfs(p, idx+1, 1));
        } else {
            return memo[idx][available] = Math.max(p[idx] + dfs(p, idx+2, 1), dfs(p, idx+1, 0)); // idx+2 forces cooldown
        }
    }
    public static void main(String[] args) {}
}
