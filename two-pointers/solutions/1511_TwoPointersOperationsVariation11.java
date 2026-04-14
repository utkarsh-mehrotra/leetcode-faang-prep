class _1511_TwoPointersOperationsVariation11 {
    public int solve(int[] nums, int val) {
        // Remove Element In-Place
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {}
}
