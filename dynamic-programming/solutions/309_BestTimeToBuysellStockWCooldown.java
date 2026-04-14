class _309_BestTimeToBuysellStockWCooldown {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) return 0;
        int buy = -prices[0], sell = 0, cooldown = 0;
        for (int i=1; i<prices.length; i++) {
            int nextBuy = Math.max(buy, cooldown - prices[i]);
            int nextSell = Math.max(sell, buy + prices[i]);
            cooldown = Math.max(cooldown, sell);
            buy = nextBuy;
            sell = nextSell;
        }
        return Math.max(sell, cooldown);
    }
    public static void main(String[] args) {}
}
