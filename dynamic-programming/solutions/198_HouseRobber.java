class _198_HouseRobber {
    Integer[] memo;
    public int solve(int[] nums) {
        memo = new Integer[nums.length];
        return dfs(nums, 0);
    }
    private int dfs(int[] nums, int i) {
        if (i >= nums.length) return 0;
        if (memo[i] != null) return memo[i];
        return memo[i] = Math.max(dfs(nums, i+1), nums[i] + dfs(nums, i+2));
    }
    public static void main(String[] args) {}
}
