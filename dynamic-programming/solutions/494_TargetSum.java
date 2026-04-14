class _494_TargetSum {
    Integer[][] memo;
    public int solve(int[] nums, int target) {
        int total = 0;
        for (int n : nums) total += n;
        memo = new Integer[nums.length][2 * total + 1];
        return dfs(nums, target, 0, 0, total);
    }
    private int dfs(int[] nums, int target, int idx, int sum, int total) {
        if (idx == nums.length) return sum == target ? 1 : 0;
        if (memo[idx][sum + total] != null) return memo[idx][sum + total];
        int add = dfs(nums, target, idx+1, sum + nums[idx], total);
        int sub = dfs(nums, target, idx+1, sum - nums[idx], total);
        return memo[idx][sum + total] = add + sub;
    }
    public static void main(String[] args) {}
}
