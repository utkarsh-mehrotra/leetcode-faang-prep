class _1016_ArraysOperationsVariation16 {
    public void solve(int[] nums) {
        // Insertion Sort
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
    }
    public static void main(String[] args) {}
}
