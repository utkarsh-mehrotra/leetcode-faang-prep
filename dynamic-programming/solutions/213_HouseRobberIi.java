class _213_HouseRobberIi {
    Integer[] memo1, memo2;
    public int solve(int[] nums) {
        if (nums.length == 1) return nums[0];
        memo1 = new Integer[nums.length];
        memo2 = new Integer[nums.length];
        return Math.max(dfs(nums, 0, nums.length-2, memo1), dfs(nums, 1, nums.length-1, memo2));
    }
    private int dfs(int[] nums, int i, int end, Integer[] memo) {
        if (i > end) return 0;
        if (memo[i] != null) return memo[i];
        return memo[i] = Math.max(dfs(nums, i+1, end, memo), nums[i] + dfs(nums, i+2, end, memo));
    }
    public static void main(String[] args) {}
}
