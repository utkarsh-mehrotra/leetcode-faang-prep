class _300_LongestIncreasingSubsequence {
    Integer[][] memo;
    public int solve(int[] nums) {
        memo = new Integer[nums.length + 1][nums.length];
        return dfs(nums, -1, 0);
    }
    private int dfs(int[] nums, int prev_index, int curr_index) {
        if (curr_index == nums.length) return 0;
        if (memo[prev_index + 1][curr_index] != null) return memo[prev_index + 1][curr_index];
        int taken = 0;
        if (prev_index < 0 || nums[curr_index] > nums[prev_index]) {
            taken = 1 + dfs(nums, curr_index, curr_index + 1);
        }
        int nottaken = dfs(nums, prev_index, curr_index + 1);
        return memo[prev_index + 1][curr_index] = Math.max(taken, nottaken);
    }
    public static void main(String[] args) {}
}
