class _377_CombinationSumIv {
    Integer[] memo;
    public int solve(int[] nums, int target) {
        memo = new Integer[target + 1];
        return dfs(nums, target);
    }
    private int dfs(int[] nums, int target) {
        if (target == 0) return 1;
        if (target < 0) return 0;
        if (memo[target] != null) return memo[target];
        int res = 0;
        for (int i=0; i<nums.length; i++) res += dfs(nums, target - nums[i]);
        return memo[target] = res;
    }
    public static void main(String[] args) {}
}
