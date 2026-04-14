class _312_BurstBalloons {
    Integer[][] memo;
    public int solve(int[] nums) {
        int[] arr = new int[nums.length + 2];
        arr[0] = 1; arr[arr.length - 1] = 1;
        for (int i=0; i<nums.length; i++) arr[i+1] = nums[i];
        memo = new Integer[arr.length][arr.length];
        return dfs(arr, 1, arr.length - 2);
    }
    private int dfs(int[] nums, int L, int R) {
        if (L > R) return 0;
        if (memo[L][R] != null) return memo[L][R];
        int max = 0;
        for (int i=L; i<=R; i++) {
            int coins = nums[L-1] * nums[i] * nums[R+1] + dfs(nums, L, i-1) + dfs(nums, i+1, R);
            max = Math.max(max, coins);
        }
        return memo[L][R] = max;
    }
    public static void main(String[] args) {}
}
