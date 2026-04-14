class _1017_ArraysOperationsVariation17 {
    public int solve(int[] nums) {
        // Missing Number Gauss Formula
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {}
}
