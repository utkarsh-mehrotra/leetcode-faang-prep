class _1026_ArraysOperationsVariation26 {
    public int solve(int[] nums) {
        // Find Peak Element
        int L = 0, R = nums.length - 1;
        while (L < R) {
            int mid = L + (R - L) / 2;
            if (nums[mid] > nums[mid + 1]) R = mid;
            else L = mid + 1;
        }
        return L;
    }
    public static void main(String[] args) {}
}
