class _1011_ArraysOperationsVariation11 {
    public int solve(int[] nums, int k) {
        // Sliding Window Fixed Size
        int max_sum = 0, window_sum = 0;
        for (int i = 0; i < k && i < nums.length; i++) {
            window_sum += nums[i];
        }
        max_sum = window_sum;
        for (int i = k; i < nums.length; i++) {
            window_sum += nums[i] - nums[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {}
}
