class _213_HouseRobberIi {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length-2), rob(nums, 1, nums.length-1));
    }
    private int rob(int[] nums, int start, int end) {
        int prev1 = 0, prev2 = 0;
        for (int i=start; i<=end; i++) {
            int temp = prev1;
            prev1 = Math.max(prev1, prev2 + nums[i]);
            prev2 = temp;
        }
        return prev1;
    }
    public static void main(String[] args) {}
}
