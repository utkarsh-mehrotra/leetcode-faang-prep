class _053_MaximumSubarray {
    Integer[] memo;
    public int solve(int[] nums) {
        memo = new Integer[nums.length];
        int max = nums[0];
        for (int i=0; i<nums.length; i++) max = Math.max(max, dp(nums, i));
        return max;
    }
    private int dp(int[] nums, int i) {
        if (i == 0) return nums[0];
        if (memo[i] != null) return memo[i];
        int sum = nums[i] + Math.max(0, dp(nums, i-1));
        return memo[i] = sum;
    }
    public static void main(String[] args) {}
}
