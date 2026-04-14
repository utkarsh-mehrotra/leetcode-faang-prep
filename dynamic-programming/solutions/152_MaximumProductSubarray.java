class _152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxP = nums[0], minP = nums[0], res = nums[0];
        for (int i=1; i<nums.length; i++) {
            int temp = maxP;
            maxP = Math.max(Math.max(maxP * nums[i], minP * nums[i]), nums[i]);
            minP = Math.min(Math.min(temp * nums[i], minP * nums[i]), nums[i]);
            res = Math.max(res, maxP);
        }
        return res;
    }
    public static void main(String[] args) {}
}
