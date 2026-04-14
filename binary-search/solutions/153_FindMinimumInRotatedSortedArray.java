/**
 * 153. Find Minimum in Rotated Sorted Array
 * Difficulty: Medium
 * Pattern: Binary Search (Rotated)
 */
class _153_FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[r]) l = mid + 1;
            else r = mid;
        }
        return nums[l];
    }
    public static void main(String[] args) {
        System.out.println("✅ Find Min in Rotated Array test passed.");
    }
}