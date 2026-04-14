class _1013_ArraysOperationsVariation13 {
    public int solve(int[] nums) {
        // Boyer-Moore Majority Vote
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args) {}
}
