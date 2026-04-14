class _1607_BinarySearchOperationsVariation7 {
    public int solve(int[] nums, int target) {
        // Search Insert Position
        int L = 0, R = nums.length - 1;
        while (L <= R) {
            int mid = L + (R - L) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) L = mid + 1;
            else R = mid - 1;
        }
        return L;
    }
    public static void main(String[] args) {}
}
