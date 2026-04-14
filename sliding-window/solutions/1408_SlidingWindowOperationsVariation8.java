class _1408_SlidingWindowOperationsVariation8 {
    public int solve(int[] fruits) {
        // Fruit Into Baskets (Longest subarray with 2 distinct elements)
        int[] count = new int[40001];
        int distinct = 0, max = 0, L = 0;
        for (int R=0; R<fruits.length; R++) {
            if (count[fruits[R]] == 0) distinct++;
            count[fruits[R]]++;
            while (distinct > 2) {
                count[fruits[L]]--;
                if (count[fruits[L]] == 0) distinct--;
                L++;
            }
            max = Math.max(max, R - L + 1);
        }
        return max;
    }
    public static void main(String[] args) {}
}
