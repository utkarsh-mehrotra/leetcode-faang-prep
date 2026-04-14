class _1021_ArraysOperationsVariation21 {
    public int solve(int[] nums) {
        // Remove Duplicates from Sorted Array
        if (nums.length == 0) return 0;
        int L = 1;
        for (int R = 1; R < nums.length; R++) {
            if (nums[R] != nums[R - 1]) {
                nums[L] = nums[R];
                L++;
            }
        }
        return L;
    }
    public static void main(String[] args) {}
}
