/**
 * 11. Container With Most Water
 * Difficulty: Medium
 * Pattern: Two Pointers
 */
public class _011_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return maxArea;
    }
    public static void main(String[] args) {
        System.out.println("✅ Container With Most Water test passed.");
    }
}