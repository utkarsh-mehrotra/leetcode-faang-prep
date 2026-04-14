class _1012_ArraysOperationsVariation12 {
    public void solve(int[] nums) {
        // Two Pointers Reverse Array
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
    public static void main(String[] args) {}
}
