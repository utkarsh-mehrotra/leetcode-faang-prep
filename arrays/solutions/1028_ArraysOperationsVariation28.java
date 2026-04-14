class _1028_ArraysOperationsVariation28 {
    public int solve(int[] nums) {
        // Jump Game
        int maxReach = 0;
        for (int i=0; i<nums.length; i++) {
            if (i > maxReach) return 0; // false
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return 1; // true
    }
    public static void main(String[] args) {}
}
