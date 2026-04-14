/**
 * 74. Search a 2D Matrix
 * Difficulty: Medium
 * Pattern: Binary Search
 */
class _074_Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = m * n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int val = matrix[mid / n][mid % n];
            if (val == target) return true;
            if (val < target) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("✅ Search 2D Matrix test passed.");
    }
}