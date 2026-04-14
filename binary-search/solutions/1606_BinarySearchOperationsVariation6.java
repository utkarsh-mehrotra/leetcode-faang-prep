class _1606_BinarySearchOperationsVariation6 {
    public int[] solve(int[] nums, int target) {
        // Find First and Last Position of Element in Sorted Array
        int[] res = new int[]{-1, -1};
        if (nums == null || nums.length == 0) return res;
        res[0] = findBound(nums, target, true);
        if (res[0] != -1) res[1] = findBound(nums, target, false);
        return res;
    }
    private int findBound(int[] nums, int target, boolean isFirst) {
        int L = 0, R = nums.length - 1;
        while (L <= R) {
            int mid = L + (R - L) / 2;
            if (nums[mid] == target) {
                if (isFirst) {
                    if (mid == L || nums[mid-1] != target) return mid;
                    R = mid - 1;
                } else {
                    if (mid == R || nums[mid+1] != target) return mid;
                    L = mid + 1;
                }
            } else if (nums[mid] < target) L = mid + 1;
            else R = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {}
}
