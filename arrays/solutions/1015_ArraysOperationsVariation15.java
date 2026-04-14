class _1015_ArraysOperationsVariation15 {
    public int solve(int[] nums) {
        // Kadanes Algorithm
        if (nums.length == 0) return 0;
        int max = nums[0];
        int curr = 0;
        for(int n : nums) {
            curr = Math.max(0, curr) + n;
            max = Math.max(max, curr);
        }
        return max;
    }
    public static void main(String[] args) {}
}
