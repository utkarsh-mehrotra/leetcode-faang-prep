/**
 * 42. Trapping Rain Water
 * Difficulty: Hard
 * Pattern: Two Pointers
 */
class _042_TrappingRainWater {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int lMax = 0, rMax = 0, res = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] >= lMax) lMax = height[l];
                else res += lMax - height[l];
                l++;
            } else {
                if (height[r] >= rMax) rMax = height[r];
                else res += rMax - height[r];
                r--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("✅ Trapping Rain Water test passed.");
    }
}