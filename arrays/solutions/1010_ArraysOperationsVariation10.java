class _1010_ArraysOperationsVariation10 {
    public int solve(int[] nums, int target) {
        // Binary Search Generic Template
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {}
}
