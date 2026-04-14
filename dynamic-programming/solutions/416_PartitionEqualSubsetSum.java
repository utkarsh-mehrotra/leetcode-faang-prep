class _416_PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum % 2 != 0) return false;
        sum /= 2;
        
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int n : nums) {
            for (int i=sum; i>=n; i--) {
                dp[i] = dp[i] || dp[i-n];
            }
        }
        return dp[sum];
    }
    public static void main(String[] args) {}
}
