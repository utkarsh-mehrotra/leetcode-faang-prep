class _1410_SlidingWindowOperationsVariation10 {
    public int solve(int[] nums, int k) {
        // Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
        int sum = 0, count = 0;
        int target = k * k; // using K as generic threshold here
        for (int i=0; i<k; i++) sum += nums[i];
        if (sum >= target) count++;
        for (int i=k; i<nums.length; i++) {
            sum += nums[i] - nums[i-k];
            if (sum >= target) count++;
        }
        return count;
    }
    public static void main(String[] args) {}
}
