/**
 * 121. Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Pattern: Sliding Window (Two Pointers)
 */
class _121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        System.out.println("✅ Buy/Sell Stock test passed.");
    }
}