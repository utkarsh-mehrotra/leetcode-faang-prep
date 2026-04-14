class _1406_SlidingWindowOperationsVariation6 {
    public int solve(int[] nums, int k) {
        // Maximum Average Subarray I
        long sum = 0;
        for (int i=0; i<k; i++) sum += nums[i];
        long max = sum;
        for (int i=k; i<nums.length; i++) {
            sum += nums[i] - nums[i-k];
            max = Math.max(max, sum);
        }
        return (int)max / k;
    }
    public static void main(String[] args) {}
}
