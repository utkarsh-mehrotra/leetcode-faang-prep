class _1507_TwoPointersOperationsVariation7 {
    public int solve(int[] nums) {
        // Remove Duplicates from Sorted Array II (At most twice)
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i-2]) nums[i++] = n;
        }
        return i;
    }
    public static void main(String[] args) {}
}
