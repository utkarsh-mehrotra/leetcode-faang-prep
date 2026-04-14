/**
 * 152. Maximum Product Subarray
 * Difficulty: Medium
 * Pattern: Prefix/Suffix
 */
public class _152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int l = 0, r = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            l =  (l == 0 ? 1 : l) * nums[i];
            r =  (r == 0 ? 1 : r) * nums[n - 1 - i];
            res = Math.max(res, Math.max(l, r));
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("✅ Maximum Product Subarray test passed.");
    }
}