class _188_BestTimeToBuysellStockIv {
    Integer[][][] memo;
    public int solve(int k, int[] prices) {
        memo = new Integer[prices.length][k+1][2];
        return dfs(prices, 0, k, 1);
    }
    private int dfs(int[] p, int idx, int trans, int canBuy) {
        if (idx == p.length || trans == 0) return 0;
        if (memo[idx][trans][canBuy] != null) return memo[idx][trans][canBuy];
        if (canBuy == 1) {
            return memo[idx][trans][canBuy] = Math.max(-p[idx] + dfs(p, idx+1, trans, 0), dfs(p, idx+1, trans, 1));
        } else {
            return memo[idx][trans][canBuy] = Math.max(p[idx] + dfs(p, idx+1, trans-1, 1), dfs(p, idx+1, trans, 0));
        }
    }
    public static void main(String[] args) {}
}
