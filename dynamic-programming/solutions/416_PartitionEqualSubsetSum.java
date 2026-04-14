class _416_PartitionEqualSubsetSum {
    Integer[][] memo;
    public boolean solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        if (sum % 2 != 0) return false;
        memo = new Integer[nums.length][sum / 2 + 1];
        return dfs(nums, 0, sum / 2);
    }
    private boolean dfs(int[] nums, int idx, int rem) {
        if (rem == 0) return true;
        if (idx == nums.length || rem < 0) return false;
        if (memo[idx][rem] != null) return memo[idx][rem] == 1;
        boolean res = dfs(nums, idx+1, rem - nums[idx]) || dfs(nums, idx+1, rem);
        memo[idx][rem] = res ? 1 : 0;
        return res;
    }
    public static void main(String[] args) {}
}
