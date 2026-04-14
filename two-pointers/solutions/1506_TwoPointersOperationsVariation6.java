class _1506_TwoPointersOperationsVariation6 {
    public int[] solve(int[] nums) {
        // Sort Array By Parity (Even then Odd)
        int L = 0, R = nums.length - 1;
        while (L < R) {
            if (nums[L] % 2 > nums[R] % 2) {
                int temp = nums[L]; nums[L] = nums[R]; nums[R] = temp;
            }
            if (nums[L] % 2 == 0) L++;
            if (nums[R] % 2 != 0) R--;
        }
        return nums;
    }
    public static void main(String[] args) {}
}
