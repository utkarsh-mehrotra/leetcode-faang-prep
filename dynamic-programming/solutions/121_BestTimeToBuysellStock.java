class _121_BestTimeToBuysellStock {
    Integer[][] memo;
    public int solve(int[] prices) {
        memo = new Integer[prices.length][2];
        return dfs(prices, 0, 1);
    }
    private int dfs(int[] p, int idx, int available) {
        if (idx == p.length || available == -1) return 0;
        if (memo[idx][available] != null) return memo[idx][available];
        if (available == 1) { // Buy state
            int buy = -p[idx] + dfs(p, idx+1, 0);
            int skip = dfs(p, idx+1, 1);
            return memo[idx][available] = Math.max(buy, skip);
        } else { // Sell state
            int sell = p[idx]; 
            int skip = dfs(p, idx+1, 0);
            return memo[idx][available] = Math.max(sell, skip);
        }
    }
    public static void main(String[] args) {}
}
