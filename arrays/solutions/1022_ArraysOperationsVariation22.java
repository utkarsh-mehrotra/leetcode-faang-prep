class _1022_ArraysOperationsVariation22 {
    public int solve(int[] height) {
        // Container With Most Water
        int max = 0;
        int L = 0, R = height.length - 1;
        while (L < R) {
            max = Math.max(max, (R - L) * Math.min(height[L], height[R]));
            if (height[L] < height[R]) L++;
            else R--;
        }
        return max;
    }
    public static void main(String[] args) {}
}
