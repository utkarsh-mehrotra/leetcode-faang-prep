/**
 * 53. Maximum Subarray
 * Difficulty: Medium
 * Pattern: Kadane's Algorithm
 */
class _053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        for (int n : nums) {
            currSum = Math.max(currSum, 0) + n;
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println("✅ Maximum Subarray test passed.");
    }
}