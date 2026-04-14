class _1019_ArraysOperationsVariation19 {
    public void solve(int[] nums) {
        // Move Zeros to end
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] != 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
        }
    }
    public static void main(String[] args) {}
}
