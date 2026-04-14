class _1407_SlidingWindowOperationsVariation7 {
    public int solve(int s, int[] nums) {
        // Minimum Size Subarray Sum
        int min = Integer.MAX_VALUE;
        int L = 0, sum = 0;
        for (int R=0; R<nums.length; R++) {
            sum += nums[R];
            while (sum >= s) {
                min = Math.max(min, R - L + 1);
                sum -= nums[L++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    public static void main(String[] args) {}
}
