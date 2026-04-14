class _1029_ArraysOperationsVariation29 {
    public int solve(int[] nums) {
        // Subarray Sum Equals K (Without Hashmap Template)
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            int sum = 0;
            for (int j=i; j<nums.length; j++) {
                sum += nums[j];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {}
}
