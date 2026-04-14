class _1009_ArraysOperationsVariation9 {
    public int[] solve(int[] nums) {
        // Prefix Sum Template
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        return prefix;
    }
    public static void main(String[] args) {}
}
